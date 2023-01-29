object Main {
  def main(args: Array[String]): Unit = {
    print("Entier 1 : ")
    var a: Int = scala.io.StdIn.readInt()
    print("Entier 2 : ")
    var b: Int = scala.io.StdIn.readInt()
    while (!(a * b == 0)) {
      if (a > b) {
        a = a - b
      } else {
        b = b - a
      }
    }
    if (a == 0) {
      println("PGCD : " + b)
    }
    if (b == 0) {
      println("PGCD : " + a)
    }
  }
}
