import play.sbt.PlayImport.guice
import sbt.*

object Dependencies {

  lazy val compile: Seq[ModuleID] = Seq(
    guice
  )

  lazy val test: Seq[ModuleID] = Seq(
    "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test,
  )

}
