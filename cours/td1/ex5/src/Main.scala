object Main {
  def main(args: Array[String]): Unit = {
    var n:Int = 0
    var i:Int = 0
    var s:Int = 0
    while(!(n==(-1))){
      print("Ecrire un entier : ")
      i=i+1
      s=s+n
      n = scala.io.StdIn.readInt()
    }
    println(s)
    var moy:Float = s.toFloat/(i-1)
    println(f"Moyenne : $moy%.2f")
  }
}