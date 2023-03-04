object Main {
  def main(args: Array[String]): Unit = {
    print("Votre nom : ")
    val nom:String=scala.io.StdIn.readLine()
    print("Votre age : ")
    val age: Int = scala.io.StdIn.readInt()
    print("Votre moyenne : ")
    val moyenne: Float = scala.io.StdIn.readFloat()
    printf("Nom : %s",nom)
    print(f"Age : $age")
    println("Moyenne : "+moyenne)
  }
}