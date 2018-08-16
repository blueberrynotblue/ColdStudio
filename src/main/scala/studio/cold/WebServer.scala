package studio.cold

import akka.http.scaladsl.server.{HttpApp, Route}
import Routes._

object WebServer extends HttpApp {
  protected def routes: Route = blogRoutes
}
