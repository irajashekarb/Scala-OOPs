package programs

import scala.io.Source

object FilesIO {
  def main(args: Array[String]): Unit = {
    try {
      val in = Source.fromFile("files/input.txt")
      val lines = in.getLines()
      lines.foreach { row => println(row) }
      in.close()
    } catch {
      case e: NumberFormatException => println(e)
    }
  }
}
