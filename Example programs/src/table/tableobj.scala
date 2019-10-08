package table

object tableobj {
  def main(args: Array[String]): Unit = {
    def tableGetter: AnyVal = {
        try {
          val t1 = new table
          t1.getNum
        } catch {
          case e: NumberFormatException => tableGetter;
        }
    }
    tableGetter
  }
}
