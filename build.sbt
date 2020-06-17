import Dependencies._

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.devcake"
ThisBuild / organizationName := "DevCake"

lazy val root = (project in file("."))
  .settings(
    name := "fp-scala",
    libraryDependencies ++= Seq(
        Logging.logger,
        Logging.logback,
        Doobie.core,
        Doobie.postgres,
        scalaTest % Test
      )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
