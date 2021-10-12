name := "coding-assignment"

version := "0.1"

scalaVersion := "2.12.12"
libraryDependencies++=Seq(
  "org.apache.spark" %% "spark-core" % "3.1.0",
  "org.apache.spark" %% "spark-sql" % "3.1.0",
)
