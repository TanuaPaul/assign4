package com.coding.assignment.problem2

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
object AirlinesDataAnalysis {
  def main(args: Array[String]): Unit = {
    val sparkSession = SparkSession.builder().master("local").appName("AirlinesDataAnalysis").getOrCreate()
    //ToDo Your code goes here



    sparkSession.close()
  }

}
