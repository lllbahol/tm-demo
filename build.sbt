name := "tm-demo"

version := "1.0"

scalaVersion := "2.11.6"

lazy val root = (project in file(".")).enablePlugins(PlayJava)


javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

scalacOptions += "-target:jvm-1.8"
/*
initialize := {
  val _ = initialize.value
  println(sys.props("java.specification.version"))
  if (sys.props("java.specification.version") != "1.8")
    sys.error("Java 8 is required for this project.")
}
*/
