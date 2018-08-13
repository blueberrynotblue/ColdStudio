import BlogRegistryActor.GetBlog
import akka.actor.{Actor, ActorLogging}
import studio.cold.entity.Blog

object BlogRegistryActor {

  final case class ActionPerformed(description: String)

  final case object GetAllBlog

  final case class GetBlog(title: String)

  final case class CreateBlog(blog: Blog)

  final case class DeleteBlog(title: String)

}

class BlogRegistryActor extends Actor with ActorLogging {
  def receive: Receive = {
    case GetBlog(title) => log.info(title)
  }
}
