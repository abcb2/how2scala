name := "how2scala"

version := "0.1.0"

scalaVersion := "2.11.2"

// sbt> runMain で指定もできる。
mainClass in (Compile, run) := Some("HelloWorld")
