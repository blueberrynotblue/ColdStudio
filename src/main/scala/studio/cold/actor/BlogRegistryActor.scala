package studio.cold.actor

import akka.actor.{Actor, ActorLogging}
import studio.cold.actor.BlogRegistryActor._
import studio.cold.dao.{Blog, BlogDao}

object BlogRegistryActor {

  final case class ActionPerformed(description: String)

  final case object GetAllBlog

  final case class GetBlog(title: String)

  final case class CreateBlog(blog: Blog)

  final case class DeleteBlog(title: String)

}

class BlogRegistryActor extends Actor with ActorLogging {
  def receive: Receive = {
    case GetBlog(title) => sender() ! BlogDao.get(title)
    case GetAllBlog => sender() ! BlogDao.findAll
    case CreateBlog(blog)=>
      BlogDao.create(blog)
      sender() ! ActionPerformed("创建成功")
    case DeleteBlog(title)=>
      BlogDao.delete(title)
      sender() ! ActionPerformed("删除成功")
  }
}
