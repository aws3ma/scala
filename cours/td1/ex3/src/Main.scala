object Main {
  def main(args: Array[String]): Unit = {
    print("Entier 1 : ")
    val a: Int = scala.io.StdIn.readInt()
    print("Entier 2 : ")
    val b: Int = scala.io.StdIn.readInt()
    // while (!(a * b == 0)) {
    //   if (a > b) {
    //     a = a - b
    //   } else {
    //     b = b - a
    //   }
    // }
    // val res: String = if (a == 0) {
    //   "PGCD : " + b
    // }
    // else {
    //   "PGCD : " + a
    // }
    // println(res)
    val diviseurs = for(i <- 1 to Math.min(a,b) if(a%i==0 && b%i==0)) yield i 
    print(diviseurs.max)
  }
}
