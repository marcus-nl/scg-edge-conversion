val compiler_2_12 = "2.12.10"
val compiler_2_13 = "2.13.1"
val library_1_12 = "1.12.5"
val library_1_13 = "1.13.0"

scalaVersion := compiler_2_13

libraryDependencies ++= List(
  "org.scala-graph" %% "graph-core" % library_1_13,
)
