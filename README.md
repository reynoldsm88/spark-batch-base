# Spark Batch Base

## Overview
This is a skeleton/example application for a spark batch application

## Building
* To build and run the tests `sbt clean test`
* To build the deployable application package `sbt clean assembly`

## Running
You can run the project on an existing Spark cluster. An easy way to start one is provided in `deploy/spark-cluster.yml`
1. Start the Spark cluster.
```bash
deploy/start-spark.sh
```
2. Verify that Spark Master and Spark worker are running and connected via the [Spark Admin Console](http://localhost:8080/)
3. Launch the application
```bash
$SPARK_HOME/bin/spark-submit \
    --class Main \
    --master spark://localhost:7077 \
    ./target/scala-2.11/spark-batch-base-assembly-0.0.1-SNAPSHOT.jar \
    --env default
```