package programs

object LambdaExp {
  def main(args: Array[String]) = {
    val square = ( x: Double )=> x * x
    val square_with_underscore: Double => Double = _ * 5
    val x:Int = 5
    println(s"Square of $x is ${square(x).toInt}")
    println(s"Square of $x is ${square_with_underscore(x).toInt}")
  }
}
