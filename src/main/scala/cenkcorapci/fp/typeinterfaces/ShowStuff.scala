package cenkcorapci.fp.typeinterfaces

import cats.Show
import cats.implicits._

object ShowStuff extends App {

  println((new {}).toString)

  case class Person(name: String, age: Int)

  val person = Person("veli", 2)

  implicit val showPerson: Show[Person] = Show.show(person => person.name)


  println(person.show)
  println(person.some)
}
