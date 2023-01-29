object Main {
  def main(args: Array[String]): Unit = {
    print("Votre nom : ")
    var nom:String=scala.io.StdIn.readLine()
    print("Votre age : ")
    var age: Int = scala.io.StdIn.readInt()
    print("Votre moyenne : ")
    var moyenne: Float = scala.io.StdIn.readFloat()
    println("Nom : "+nom)
    println("Nom : "+age)
    println("Nom : "+moyenne)
  }
}