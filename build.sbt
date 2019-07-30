import Dependencies._

ThisBuild / name := "Sandbox"
ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "2.13.0"
ThisBuild / organization := "com.dvwilliamson"

//lazy val testing = (project in file("testing"))
//  .settings(
//    name := "testing",
//    libraryDependencies ++= testDependencies
//  )

libraryDependencies ++= testDependencies