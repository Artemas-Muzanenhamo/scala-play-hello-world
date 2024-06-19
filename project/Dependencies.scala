import sbt.*

object Dependencies {

  lazy val test: Seq[ModuleID] = Seq(
    "org.scalatestplus" %% "junit-5-10" % "3.2.18.0" % "test"
  )

}
