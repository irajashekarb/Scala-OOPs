package programs

object LambdaExp {
  def main(args: Array[String]): Unit = {
    /*
     *Lambda Expression is represented by "=>"
    */
    // Function that uses variable names in lambda expression
    val square = ( x: Double )=> x * x

    // Function that uses underscore notation in lambda expression
    val square_with_underscore: Double => Double = _ * 5

    // Function that takes two arguments and returns boolean for comparision
    val lt: (Double, Double) => Boolean = _ < _

    // Assigning variable x to some random value
    val x:Int = 5

    // printing out results
    println(s"Square of $x is ${square(x).toInt}")
    println(s"Square of $x is ${square_with_underscore(x).toInt}")
    println(lt(5, 6))
  }
}
