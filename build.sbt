lazy val akkaHttpVersion = "10.1.3"
lazy val akkaVersion = "2.5.14"
lazy val catsVersion = "1.2.0"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "studio.cold",
      scalaVersion := "2.12.6"
    )),
    name := "ColdStudio",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream" % akkaVersion,
      //      "org.typelevel" %% "cats-core" % catsVersion,
      "org.postgresql" % "postgresql" % "9.4.1212",
      "io.getquill" %% "quill-jdbc" % "2.5.4",
      "ch.qos.logback" % "logback-classic" % "1.2.3",

      "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
      "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
      "org.scalatest" %% "scalatest" % "3.0.5" % Test
    )
  )
