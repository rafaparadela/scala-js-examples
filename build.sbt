name := "demo-examples"

version := "1.0"

scalaVersion := "2.11.6"

enablePlugins(ScalaJSPlugin)

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"

scalaJSStage in Global := FastOptStage

