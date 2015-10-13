enablePlugins(ScalaJSPlugin)

name := "demo-examples"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.2"

jsDependencies += RuntimeDOM

scalaJSStage in Global := FastOptStage

persistLauncher := true

