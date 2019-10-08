package table

object tableobj {
  def main(args: Array[String]): Unit = {
    try {
      val t1 = new table
      t1.getNum
    } catch {
      case e: NumberFormatException => val t1 = new table; t1.getNum
    }
  }
}
