import zio.console.putStrLn
import zio.{Task, UIO, ZIO}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext
implicit val ec = ExecutionContext.global


def z: UIO[Unit] = Task.succeed(putStrLn("hello"))

def f: Future[Unit] = Future.successful(println("hello"))
val f1 = for {
_ <- f
_ <- f
} yield ()

val z1 = for {
_ <- z
_ <- z
} yield ()
