import Dependencies._

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "ph.samson.tjem",
      organizationName := "Edward Samson",
      startYear := Some(2018),
      licenses += ("GPL-3.0", new URL(
        "http://www.gnu.org/licenses/gpl-3.0-standalone.html")),
      scalaVersion := "2.12.7",
      version := "0.1.0-SNAPSHOT"
    )),
  name := "Trello JSON Export Munger",
  libraryDependencies ++= Seq(
    betterFiles,
    circeCore,
    circeGeneric,
    circeGenericExtras,
    circeParser,
    kantanCsv,
    kantanCsvGeneric,
    scalaLogging
  ),
  libraryDependencies ++= Seq(
    janino,
    logbackClassic
  ) map (_ % Runtime),
  libraryDependencies ++= Seq(
    scalaTest
  ) map (_ % Test)
)
