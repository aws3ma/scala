object Main {
  def main(args: Array[String]): Unit = {
    var n: Int = 0
    while (n < 4 || n > 9) {
      print("donner taille du tableau : ")
      n = scala.io.StdIn.readInt()
    }
    var tab = new Array[Float](n)
    var i: Int = 0
    for (i <- 0 to n - 1) {
      print(f"t[$i]")
      tab(i) = scala.io.StdIn.readFloat()
    }

    println(tab.mkString(", "))
    var sum = tab.sum
    println(f"Somme : $sum")
    var moy = sum / n
    println(f"Moyenne : $moy")
    var min = tab.min
    var max = tab.max
    println(f"Max : $max")
    println(f"Min : $min")
    var sorted = tab.sorted
    println(sorted.mkString(", "))
  }
}
