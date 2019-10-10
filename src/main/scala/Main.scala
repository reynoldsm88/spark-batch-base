import org.apache.spark.sql.SparkSession
import org.example.SparkJob

object Main {

    def main( args : Array[ String ] ) : Unit = {
        val spark = SparkSession
          .builder()
          .appName( s"example-spark-job-${System.currentTimeMillis()}" )
          .getOrCreate()

        val job = new SparkJob( spark )
        val results = job.execute()
        results.show()

        spark.stop()
    }

}