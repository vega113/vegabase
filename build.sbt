name := """Vegabase"""

version := "1.0"

scalaVersion := "2.11.2"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5"

libraryDependencies += "com.couchbase.client" % "java-client" % "2.0.3"

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")

EclipseKeys.withSource := true