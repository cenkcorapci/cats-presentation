package cenkcorapci.fp.typeinterfaces

//import cats.implicits._

object Equality extends App {
  println(List(1, 2, 3).map(Option(_)).filter(_ == 1))

  //println(List(1, 2, 3).map(Option(_)).filter(_ === 1))
}
