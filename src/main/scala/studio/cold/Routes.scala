package studio.cold

import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._

object Routes {
  val blogRoutes:Route={
    host("blog.cold.studio"){
      complete(
        HttpEntity(ContentTypes.`text/html(UTF-8)`,"")
      )
    }
  }
}
