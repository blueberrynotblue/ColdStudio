package studio.cold


object Main extends App {
//  WebServer.startServer("0.0.0.0",8080)

  val str="bind_1month_88"
  val index=str.lastIndexOf("_")
  println(index)
  println(str.substring(0,index))
}

