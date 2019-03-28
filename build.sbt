name := "cats-presentation"

version := "0.0.0"

scalaVersion := "2.12.8"


libraryDependencies ++= {
  val catsV = "1.6.0"
  val catsEffectV = "1.2.0"

  Seq(
    "org.typelevel" %% "cats-core" % catsV,
    "org.typelevel" %% "cats-effect" % catsEffectV
  )
}