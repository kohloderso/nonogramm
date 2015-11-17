name := "nonogramm"

version := "1.0"

lazy val `nonogramm` = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq( javaJdbc , cache , javaWs )
libraryDependencies += evolutions

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  