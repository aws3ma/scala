import scala.compiletime.ops.float
object Main {
  def main(args: Array[String]): Unit = {
    var n: Int = 0
    while (n < 4 || n > 9) {
      print("donner taille du tableau : ")
      n = scala.io.StdIn.readInt()
    }
    val tab = new Array[Float](n)
    tab.indices.foreach{ i => 
      print(f"t[$i]")
      tab(i) = scala.io.StdIn.readFloat()
    }
    println(tab.mkString(", "))
    val sum = tab.sum
    println(f"Somme : $sum")
    val moy = sum / n
    println(f"Moyenne : $moy")
    val min = tab.min
    val max = tab.max
    println(f"Max : $max")
    println(f"Min : $min")
    val sorted = tab.sorted
    println(sorted.mkString(", "))
  }
}
