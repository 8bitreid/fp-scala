import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.1"

  object Doobie {
    val doobieVersion = "0.9.0"
    lazy val core = "org.tpolecat" %% "doobie-core" % doobieVersion
    lazy val postgres = "org.tpolecat" %% "doobie-postgres" % doobieVersion
    lazy val quill = "org.tpolecat" %% "doobie-quill" % doobieVersion
    lazy val hikari = "org.tpolecat" %% "doobie-hikari" % doobieVersion
  }

  object Logging {
    lazy val logger = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
    lazy val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"
  }

  object SoftwareMill {
    val tapirVersion = "0.14.5"
    lazy val tapir = "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % tapirVersion
    lazy val http4sServer ="com.softwaremill.sttp.tapir" %% "tapir-http4s-server" % tapirVersion
    lazy val openapiDocs = "com.softwaremill.sttp.tapir" %% "tapir-openapi-docs" % tapirVersion
    lazy val openapiCirceYaml = "com.softwaremill.sttp.tapir" %% "tapir-openapi-circe-yaml" % tapirVersion
    lazy val swaggerUi = "com.softwaremill.sttp.tapir" %% "tapir-swagger-ui-http4s" % tapirVersion
  }

  object Zio {
    private val zioVersion = "1.0.0-RC21-2"
    lazy val zio = "dev.zio" %% "zio" % zioVersion
    lazy val interopCats = "dev.zio" %% "zio-interop-cats" % "2.0.0.0-RC13"
    lazy val streams = "dev.zio" %% "zio-streams" % zioVersion
  }
}
