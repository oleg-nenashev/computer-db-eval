import play.Project._

name := "computer-db-eval"

version := "1.0"

libraryDependencies ++= Seq(javaJdbc, javaEbean)

playJavaSettings
