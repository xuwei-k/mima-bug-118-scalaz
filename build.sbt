val commonSettings = Seq(
  scalaVersion := "2.11.8"
)

val a = project.settings(
  commonSettings,
  libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.0"
)

val b = project.settings(
  commonSettings,
  libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.1"
).dependsOn(
  a
)
