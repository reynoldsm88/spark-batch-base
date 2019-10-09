import sbt._

object Dependencies {

    val slf4jVersion = "1.7.20"
    val logbackVersion = "1.2.3"
    val scalaTestVersion = "3.0.5"
    val betterFilesVersion = "3.8.0"
    val sparkVersion = "2.4.4"
    val sparkNlpVersion = "2.2.2"
    val sparkFastTestVersion = "0.20.0-s_2.12"

    val logging = Seq( "org.slf4j" % "slf4j-api" % slf4jVersion,
                       "ch.qos.logback" % "logback-classic" % logbackVersion )

    val betterFiles = Seq( "com.github.pathikrit" %% "better-files" % betterFilesVersion )

    val scalaTest = Seq( "org.scalatest" %% "scalatest" % scalaTestVersion % Test )

    val spark = Seq( "org.apache.spark" %% "spark-core" % sparkVersion % Provided,
                     "org.apache.spark" %% "spark-sql" % sparkVersion % Provided )

    val sparkNlp = Seq( "com.johnsnowlabs.nlp" %% "spark-nlp" % sparkNlpVersion )

    val sparkFastTests = Seq( "MrPowers" % "spark-fast-tests" % sparkFastTestVersion % Test )

}