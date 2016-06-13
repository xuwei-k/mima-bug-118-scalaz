package com.example

import ToTypeClassOps0._
import scalaz.Kleisli

object Main {
  def main(args: Array[String]): Unit = {
    try {
      import scalaz.std.tuple._
      val x = ((1, 2), 3).reassociateRight[Int, Int]
      println(x)
    } catch {
      case e: Throwable =>
        e.printStackTrace()
    }

    import scalaz.std.option._
    val f: Kleisli[Option, Int, Int] = Kleisli(a => Some(a + 1))
    val g = f.proleft[String]
    g(scalaz.-\/(42))
  }
}
