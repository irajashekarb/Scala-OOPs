package programs

object ArrayAndList {
  def main(args: Array[String]): Unit = {
    // Difference between an Array and List is mutability
    // Array are mutable
    // List are immutable
    val arr = Array(1, 2, 3, 5, 6)
    val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

    for(i <- 0 until arr.length) {
      println(arr(i))
    }

    days match {
      case firstDay :: otherDays =>
        println("The first day of the week is: " + firstDay)
      case Nil =>
        println("There don't seem to any week days.")
    }
  }
}
