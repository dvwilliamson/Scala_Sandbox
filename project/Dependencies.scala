import sbt._

object Dependencies {

  val testDependencies: Seq[ModuleID] = Seq(
    "org.scalactic" %% "scalactic" % "3.0.8",
    "org.scalatest" %% "scalatest" % "3.0.8" % "test"
  )

}
