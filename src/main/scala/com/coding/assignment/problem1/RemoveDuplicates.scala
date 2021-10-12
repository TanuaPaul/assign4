package com.coding.assignment.problem1

import scala.collection.mutable.ListBuffer

object RemoveDuplicates {
  def main(args: Array[String]): Unit = {
    var personList = new ListBuffer[Person]()
    personList += Person("Rajesh", 21, "London")
    personList += Person("Suresh", 28, "California")
    personList += Person("Sam", 26, "Delhi")
    personList += Person("Rajesh", 21, "Gurgaon")
    personList += Person("Manish", 29, "Bengaluru")
    personList += Person("Manish", 33, "Bengaluru")
//Todo write the logic here to remove duplicates

  }
  }