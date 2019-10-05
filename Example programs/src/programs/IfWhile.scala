package programs

import scala.io.StdIn._

object IfWhile {
  def main(args: Array[String]): Unit = {
    // Do not make use of more number of var keyword in your program this might lead to side effects
    var i = 0
    while(i < 10) {
      println(i)
      i += 1
    }

    // IF program for age acceptance
    println("Enter your name: ")
    val name: String = readLine()
    println("Enter your age: ")
    val age: Int = readInt()

    if (age < 18) {
      println(s"Sorry $name you are elligible for login. Come after ${18 - age} years")
    }
    else {
      println(s"Hurray! $name you are elligible for login")
    }
  }
}
