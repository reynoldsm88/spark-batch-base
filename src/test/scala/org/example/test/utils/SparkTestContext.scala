package org.example.test.utils

import org.apache.spark.sql.SparkSession

trait SparkTestContext {

    val spark : SparkSession = {
        SparkSession.builder()
          .master( "local" )
          .appName( "spark-test" )
          .config( "spark.sql.shuffle.partitions", 1 )
          .getOrCreate()
    }

}
