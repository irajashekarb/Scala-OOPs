package programs

import scala.io.StdIn._

object TryCatch {
  def main(args: Array[String]): Unit = {
    // IF program for age acceptance
    println("Enter your name: ")
    val name: String = readLine()
    println("Enter your age: ")
    def ageChecker: Unit = {
      try {
        val age: Int = readInt()
        val ageInt = age.toInt
        if( age < 18) {
          println(s"Sorry $name you are not eligible for login. Come after ${18 - ageInt} years")
        } else {
          println(s"Hurray!, $name you are eligible for login. Have a good day")
        }
      }catch {
        case e: NumberFormatException => println("Please enter valid age:"); ageChecker
      }
    }
    ageChecker


  }
}
