import sbt._
import Dependencies._

organization in ThisBuild := "com.github.reynoldsm88"
name := "spark-batch-base"
scalaVersion in ThisBuild := "2.11.12"

mainClass in(Compile, run) := Some( "Main" )
enablePlugins( JavaAppPackaging )

resolvers in ThisBuild ++= Seq( "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases",
                                "Spray IO Repository" at "https://repo.spray.io/",
                                "Maven Central" at "https://repo1.maven.org/maven2/",
                                "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/",
                                "JCenter" at "https://jcenter.bintray.com",
                                "Local Ivy Repository" at s"file://${System.getProperty( "user.home" )}/.ivy2/local/default",
                                "Spark Packages Repo" at "https://dl.bintray.com/spark-packages/maven" )

lazy val root = ( project in file( "." ) ).settings( libraryDependencies ++= spark ++ sparkFastTests ++ sparkNlp ++ logging ++ scalaTest )


test in assembly := {}
assemblyMergeStrategy in assembly := {
    case PathList( "META-INF", "MANIFEST.MF" ) => MergeStrategy.discard
    case PathList( "reference.conf" ) => MergeStrategy.concat
    case x => MergeStrategy.last
}