name := "fpinscala-study"

version := "0.1"

scalaVersion := "2.11.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-encoding", "UTF-8",
  "-language:postfixOps"
)

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.12.3" % "test"
)
