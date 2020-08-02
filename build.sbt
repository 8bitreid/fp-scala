import Dependencies._

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.devcake"
ThisBuild / organizationName := "DevCake"

lazy val root = (project in file("."))
  .settings(
    name := "fp-scala",
    libraryDependencies ++= Seq(
        Doobie.core,
        Doobie.postgres,
        Doobie.quill,
        Logging.logger,
        Logging.logback,
        SoftwareMill.http4sServer,
        SoftwareMill.openapiCirceYaml,
        SoftwareMill.openapiDocs,
        SoftwareMill.tapir,
        SoftwareMill.swaggerUi,
        Zio.interopCats,
        Zio.zio,
        scalaTest % Test
      )
  )
// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
