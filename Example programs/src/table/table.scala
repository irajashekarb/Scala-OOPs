package table

import scala.io.StdIn.readInt

class table() {
  def getNum = {
      println("Enter the table number that you want: ")
      val number = readInt()
      tabnum(number)
  }
  def tabnum(number: Int) = {
    for(i <- 1 until 11) {
      println(s"$number * $i = ${number * i}")
    }
  }
}
