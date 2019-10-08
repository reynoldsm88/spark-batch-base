import sbt._
import Dependencies._

organization in ThisBuild := "org.example"
name := "spark-batch-base"
version in ThisBuild := "0.0.1-SNAPSHOT"
scalaVersion in ThisBuild := "2.11.12"

resolvers in ThisBuild ++= Seq( "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases",
                                "Spray IO Repository" at "http://repo.spray.io/",
                                "Maven Central" at "https://repo1.maven.org/maven2/",
                                "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
                                "JCenter" at "http://jcenter.bintray.com",
                                "Local Ivy Repository" at s"file://${System.getProperty( "user.home" )}/.ivy2/local/default",
                                "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven" )

lazy val root = ( project in file( "." ) ).settings( libraryDependencies ++= spark ++ sparkFastTests ++ sparkNlp ++ logging ++ scalaTest )
