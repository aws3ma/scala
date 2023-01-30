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
    val res: String = if (a == 0) {
      "PGCD : " + b
    }
    else {
      "PGCD : " + a
    }
    println(res)
  }
}
