object Main {
  def main(args: Array[String]): Unit = {
    print(pow(2, 0))
  }
  def pow(x: Double, entier: Int): Double = {
    var y = 1d
    for (i <- 1 to entier)
      y = y * x
    y
  }
}
