package com.coding.assignment.problem1

class Person(val name:String,val age:Int,val location:String) {

  override def toString: String = {
  s"Person(${name},${age},${location}"
  }
}
object  Person{
  def apply(name: String, age: Int, location: String): Person = new Person(name, age, location)

}