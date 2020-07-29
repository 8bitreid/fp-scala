import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1"

  object Logging {
    lazy val logger = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
    lazy val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"
  }

  object Doobie {
    lazy val core = "org.tpolecat" %% "doobie-core" % "0.8.8"
    lazy val postgres = "org.tpolecat" %% "doobie-postgres" % "0.8.8"
  }

  object Zio {
    lazy val zio = "dev.zio" %% "zio" % "1.0.0-RC21-2"
  }
}
