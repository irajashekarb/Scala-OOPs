package programs

object ForComprehension {
  def main(args: Array[String]): Unit = {
    /*
    Scala for loops can have generators as shown below such as "i"
    it also can have conditions by using ";"
     */

    // For loops with only generators
    for (i <- 1 to 10) {
      println(i)
    }

    // For loops with generators and conditionals
    for(i <- 1 to 10; if i%3 ==0 || i%5==0) {
      println(i)
    }
  }
}
