import scala.util.control.Breaks._
object Main {
  def main(args: Array[String]): Unit = {
    var n: Int = 0
    while (n < 20) {
      print("Entrer un entier superieur a 20 : ")
      n = scala.io.StdIn.readInt()
    }
    var i: Int = 0

    for (i <- 2 to n) {
      if (nbDivide(i) == 1) {
        println(i)
      }
    }
  }
  def nbDivide(x: Int): Int = {
    var s: Int = 0
    var j: Int = 0
    for (j <- 2 to x) {
      if (x % j == 0) {
        s = s + 1
      }
    }
    return s
  }
}
