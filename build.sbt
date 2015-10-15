import ByteConversions._

name := "demo"

version := "0.1"

scalaVersion := "2.11.7"

mainClass := Some("com.example.Demo")

SandboxKeys.imageVersion in Global := "1.0.11"

resolvers += "typesafe-releases" at "http://repo.typesafe.com/typesafe/maven-releases"

libraryDependencies += "com.typesafe.conductr" %% "scala-conductr-bundle-lib" % "1.0.1"

lazy val root = project.in(file(".")).enablePlugins(JavaAppPackaging)

BundleKeys.nrOfCpus := 1.0

BundleKeys.memory := 64.MiB

BundleKeys.diskSpace := 5.MB
