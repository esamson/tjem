import sbt._

object Dependencies {
  val betterFiles = "com.github.pathikrit" %% "better-files" % "3.6.0"

  val janino = "org.codehaus.janino" % "janino" % "3.0.8"
  val logbackClassic = "ch.qos.logback" % "logback-classic" % "1.2.3"
  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"

  val circeVersion = "0.10.0"
  val circeCore = "io.circe" %% "circe-core" % circeVersion
  val circeGeneric = "io.circe" %% "circe-generic" % circeVersion
  val circeGenericExtras = "io.circe" %% "circe-generic-extras" % circeVersion
  val circeParser = "io.circe" %% "circe-parser" % circeVersion

  val kantanVersion = "0.5.0"
  val kantanCsv = "com.nrinaudo" %% "kantan.csv" % kantanVersion
  val kantanCsvGeneric = "com.nrinaudo" %% "kantan.csv-generic" % kantanVersion

  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
}
