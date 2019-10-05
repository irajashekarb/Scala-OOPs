package programs

object MatchExpr {
  def main(args: Array[String]): Unit = {
    /*
    Let's create a fizzbizz program
    Problem statement: Write a short program that prints each number from 1 to 100 on a new line.
    For each multiple of 3, print "Fizz" instead of the number.
    For each multiple of 5, print "Buzz" instead of the number.
    For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number
     */

    for(i <- 1 to 100) yield {
      (i%3, i%5) match {
        case (0, 0) => println("FizzBuzz")
        case (0, _) => println("Fizz")
        case (_, 0) => println("Buzz")
        case (_, _) => println(i)
      }
    }
  }
}
