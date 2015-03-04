name := "ScalaStatsd"

version := "2.0.1"

crossPaths := false

organization := "com.hootsuite"

scalaVersion := "2.11.5"

publishTo := Some(Resolver.file("HootSuite repo", file("/var/www/maven-development")))

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases"

resolvers += "Sonatype" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies ++= Seq(
  "com.typesafe"  %  "config"    % "1.2.1",
  "org.scalatest" %% "scalatest" % "2.2.4"    % "test"
)

