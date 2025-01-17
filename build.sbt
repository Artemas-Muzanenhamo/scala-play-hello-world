
ThisBuild / scalaVersion     := "3.4.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"
ThisBuild / libraryDependencies ++= Dependencies.compile ++ Dependencies.test

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "scala-play-hello-world",
  )

lazy val integration = (project in file("it"))
  .dependsOn(root)
  .settings(
    publish / skip := true
  )