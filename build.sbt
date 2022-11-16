
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

val slickVersion = "5.1.0"

val h2DatabaseVersion = "2.1.214"

lazy val root = (project in file("."))
  .settings(
    name := "ICPT",
    libraryDependencies ++= Seq(
      guice,
      evolutions,
      "com.h2database" % "h2" % h2DatabaseVersion,
      "org.scala-lang" % "scala-reflect" % scalaVersion.value,
      "com.typesafe.play" %% "play-slick" % slickVersion,
      "com.typesafe.play" %% "play-slick-evolutions" % slickVersion,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % "test"
    )

  ).enablePlugins(PlayScala)
  // Use sbt default layout
  .disablePlugins(PlayLayoutPlugin)

