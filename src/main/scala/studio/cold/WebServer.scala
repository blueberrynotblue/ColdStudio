package studio.cold

import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.{HttpApp, Route}

object WebServer extends HttpApp{
  protected def routes: Route =
    extractHost{host=>
      println(host)
      pathSingleSlash{
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`,"<h1>index</h1>"))
      }~
        path("hello"){
          get{
            complete(HttpEntity(ContentTypes.`text/html(UTF-8)`,"<h1>hello</h1>"))
          }
        }
    }
}
