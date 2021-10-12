package com.coding.assignment.problem3


import org.apache.spark.sql.{SparkSession}



object ClickStreamAnalysis {
  def main(args: Array[String]): Unit = {

    val sparkSession = SparkSession.builder().master("local").appName("ClickStreamAnalysis").getOrCreate()
    import sparkSession.implicits._
    var clickStreamDf = Seq(("2021-01-01T11:00:00Z", "u1"), ("2021-01-01T12:00:00Z", "u1"), ("2021-01-01T11:00:00Z", "u2"),
      ("2021-01-02T11:00:00Z", "u2"), ("2021-01-01T12:15:00Z", "u1"), ("2021-01-01T12:44:00Z", "u1"), ("2021-01-01T13:00:00Z", "u1"),
      ("2021-01-01T13:27:00Z", "u1"), ("2021-01-01T13:55:00Z", "u1"), ("2021-01-01T14:15:00Z", "u1"))
      .toDF("timestamp", "userid")
    clickStreamDf.show(false)

    //ToDo Your code goes here
  }
}