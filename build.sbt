val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-notes",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    
    semanticdbEnabled := true,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
