object Main{
    def main(args:Array[String]):Unit={
        print(conditionelle("Hello world",p,f))
    }
    def conditionelle(x:String,p:String=>Boolean,f:String=>String):Boolean = {
        if(p(x)){
            f(x)
        }else{
            x
        }
    }
    def p(x:String):Boolean={
        True
    }
    def f(x:String):String={
        "Hello"
    }
}