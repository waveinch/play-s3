val playVersion = "2.7.6"

lazy val root = (project in file("."))
  .settings(
    name := "play-s3",
    organization := "net.kaliber",
    scalaVersion := "2.13.3",
    bintrayRepository := "maven",
    bintrayOrganization := Some("waveinch"),
    publishMavenStyle := true,
    licenses += ("Apache-2.0", url("http://www.opensource.org/licenses/apache2.0.php")),
    git.useGitDescribe := true,
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-ws"     % playVersion % "provided",
      "com.typesafe.play" %% "play-test"   % playVersion % "test",
      "com.typesafe.play" %% "play-specs2" % playVersion % "test",
      "org.scalatest" %% "scalatest" % "3.0.8" % "test",
      "com.typesafe.play" %% "play-ahc-ws" % playVersion % "test",
      "com.typesafe.play" %% "play-logback" % playVersion % "test",
      "commons-codec" % "commons-codec" % "1.11" % "provided",
      "com.typesafe.play" % "shaded-asynchttpclient" % "2.0.1" % "provided"
    )
  ).enablePlugins(
  GitVersioning
)


scalacOptions ++= Seq("-feature", "-deprecation")

parallelExecution in Test := false

