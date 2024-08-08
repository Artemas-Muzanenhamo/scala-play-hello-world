ThisBuild / scalaVersion     := "3.4.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "scala-play-hello-world",
    libraryDependencies ++= Dependencies.compile ++ Dependencies.test
  )
