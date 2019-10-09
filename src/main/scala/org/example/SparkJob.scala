package org.example

import org.apache.spark.sql.{DataFrame, Row, SparkSession}

class SparkJob( val spark : SparkSession ) {

    import spark.implicits._

    def execute( ) : DataFrame = {
        val df = Seq( ("thurston", 61), ("kim", 66), ("lee", 63), ("steve", 57) ).toDF( "name", "age" )

        val result = df.select( $"name", $"age" ).where( $"age" > 60 )

        result.show()
        result
    }

}
