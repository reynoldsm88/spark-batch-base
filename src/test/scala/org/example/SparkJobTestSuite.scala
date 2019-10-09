package org.example

import com.github.mrpowers.spark.fast.tests.DatasetComparer
import org.example.test.utils.SparkTestContext
import org.scalatest.FlatSpec

class SparkJobTestSuite extends FlatSpec with SparkTestContext with DatasetComparer {

    "this" should "work" in {
        val sparkJob : SparkJob = new SparkJob( spark )
        sparkJob.execute()
    }

}
