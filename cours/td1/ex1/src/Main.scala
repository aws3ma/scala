object Main {
  def main(args: Array[String]): Unit = {
    print("Donner x : ")
    var x:Int=scala.io.StdIn.readInt()
    print("Donner y : ")

    var y:Int=scala.io.StdIn.readInt()
    if(x!=y){
      println(x+y)
    }else{
      println((x+y)*3)
    }
  }
}