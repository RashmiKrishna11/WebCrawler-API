ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"


libraryDependencies +=
"com.typesafe.akka" %% "akka-slf4j" % "2.6.19"

libraryDependencies +=
"com.typesafe.akka" %%"akka-http-core" % "10.2.9"
libraryDependencies +=
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.2.9"
libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor" % "2.6.19"
libraryDependencies +=
  // For Akka 2.4.x or 2.5.x
  "com.typesafe.akka" %% "akka-http" % "10.2.9"
libraryDependencies +=
  // Only when running against Akka 2.5 explicitly depend on akka-streams in same version as akka-actor
  "com.typesafe.akka" %% "akka-stream" % "2.6.19" // or whatever the latest version is
libraryDependencies +=
  "com.typesafe.akka" %% "akka-actor"  % "2.6.19" // or whatever the latest version is


libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.36",
  "org.slf4j" % "slf4j-simple" % "1.7.36",

  "org.async httpclient" % "async-http-client" % "2.12.3",
  "org.jsoup" % "jsoup" % "1.15.2",

  "org.sca lactic" %% "sca lactic" % "3.2.12",
  "org.scalatest" %% "scalatest" % "3.2.12" % "test",

  "ch.qos.logback" % "logback-classic" % "1.2.11",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
)

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.0")

lazy val root = (project in file("."))
  .settings(
    name := "webcrawler2"
  )
