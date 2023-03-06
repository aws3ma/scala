object Main{
    def main(args:Array[String]):Unit={
        echo("hello"," ","world")
    }
    def echo(args:String*)= for(arg<-args) print(arg)
}