#!/bin/bash

PROJECT=$(cd $(dirname $0)/..; pwd)
cd $PROJECT

docker-compose -f deploy/spark-cluster.yml up -d