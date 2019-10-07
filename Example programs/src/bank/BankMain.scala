package bank

import scala.io.StdIn._

object BankMain {
  def main(args: Array[String]): Unit = {
    val bank = new Bank
    var option = 0
    var customer: Option[Customer] = None
    var account: Option[Customer] = None


    while(option != 10) {
      println(menu)
      option = readInt()
      option match {
        case 1 =>
        case 2 =>
        case 3 =>
        case 4 =>
        case 5 =>
        case 6 =>
        case 7 =>
        case 8 =>
        case 9 =>
        case 10 =>
        case _ => println("This is not a valid option. Please select again.")
      }
    }
  }

  private val menu =
}
