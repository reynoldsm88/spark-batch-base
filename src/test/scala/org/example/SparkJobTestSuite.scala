package org.example

import com.github.mrpowers.spark.fast.tests.DatasetComparer
import org.apache.spark.sql.DataFrame
import org.example.test.utils.SparkTestContext
import org.scalatest.{FlatSpec, Matchers}

class SparkJobTestSuite extends FlatSpec with Matchers with SparkTestContext with DatasetComparer {

    "Simple Spark SQL job" should "work" in {
        val sparkJob : SparkJob = new SparkJob( spark )
        val results : DataFrame = sparkJob.execute()

        results.show()
        results.count() shouldBe 3
    }

}