object Main {
  def main(args: Array[String]): Unit = {
    print("Donner x : ")
    val x:Int=scala.io.StdIn.readInt()
    print("Donner y : ")
    val y:Int=scala.io.StdIn.readInt()
    if(x!=y){
      println(x+y)
    }else{
      println((x+y)*3)
    }
  }
}