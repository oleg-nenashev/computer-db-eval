import play.Project._

name := "computer-db-eval"

version := "1.0"

libraryDependencies ++= Seq(javaJdbc, javaEbean)

libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1102-jdbc41"

playJavaSettings
