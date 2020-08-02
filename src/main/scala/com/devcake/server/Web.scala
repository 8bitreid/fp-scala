package com.devcake.server

import com.typesafe.scalalogging.StrictLogging
import zio.console.Console
import zio.{ExitCode, URIO, ZIO}
import doobie.implicits._
import doobie.postgres.implicits._
import doobie.implicits.legacy.instant._
import cats.implicits._
import com.typesafe.scalalogging.StrictLogging

object Web extends zio.App with StrictLogging {

  def run(args: List[String]): URIO[Any with Console, ExitCode] = myAppLogic.exitCode


  // DB


  // Service


  // Routes


  // Server

  val myAppLogic: ZIO[Any, Nothing, Unit] = for {
    _ <- ZIO.succeed(logger.info("Hello, DevCake!"))
  } yield()

}
