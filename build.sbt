name:="spring-starter"

version := "1.0"

scalaVersion :="2.10.2"

libraryDependencies ++= Seq (
	"org.scalatest" % "scalatest_2.10" % "2.0" % "test->*",
	"org.springframework" % "spring-beans" % "4.0.2.RELEASE",
	"org.springframework" % "spring-core" % "4.0.2.RELEASE",
	"org.springframework" % "spring-context" % "4.0.2.RELEASE"
)