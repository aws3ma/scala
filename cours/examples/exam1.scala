object Main {
    def main(args: Array[String]): Unit = {
        val a = sum
        print(a(1,2,3))
    }
    def sum(a:Int,b:Int,c:Int):Int = a+b+c
}
