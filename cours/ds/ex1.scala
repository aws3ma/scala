object Main {
  def main(args: Array[String]): Unit = {
    myFunc(1, "Scala")
    myFunc(1)
    myFunc(a = 1)
    myFunc(a = 1, b = "Scala")
    myFunc(b = "Scala", a = 1)
    myFunc(b = "Scala")
  }
  def myFunc(a: Int, b: String = "Hello") = ???
}