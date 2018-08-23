package studio.cold

import studio.cold.UserRegistryActor.ActionPerformed
import studio.cold.dao.{Blog, BlogTag, BlogWithoutContent, Tag}

//#json-support
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json.DefaultJsonProtocol

trait JsonSupport extends SprayJsonSupport {
  // import the default encoders for primitive types (Int, String, Lists etc)
  import DefaultJsonProtocol._

  implicit val userJsonFormat = jsonFormat3(User)
  implicit val usersJsonFormat = jsonFormat1(Users)

  implicit val actionPerformedJsonFormat = jsonFormat1(ActionPerformed)

  implicit val blogJsonFormat=jsonFormat3(Blog)
  implicit val blogWithoutContentJsonFormat=jsonFormat2(BlogWithoutContent)
  implicit val blogTagJsonFormat=jsonFormat2(BlogTag)
  implicit val tagJsonFormat=jsonFormat1(Tag)
}
//#json-support
