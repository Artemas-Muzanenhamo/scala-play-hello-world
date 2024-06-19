import sbt.*

object Dependencies {

  lazy val test: Seq[ModuleID] = Seq(
    "org.scalameta" %% "munit" % "1.0.0" % Test
  )

}
