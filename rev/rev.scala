import java.util.ArrayList
object Main {
  def main(args: Array[String]): Unit = {
    // td1_ex1()
    // td1_ex2()
    // td1_ex3()
    // td1_ex4()
    // td1_ex5()
    // td1_ex6()
    // td2_ex1()
    // td2_ex2()
    // td2_ex3()
    // td2_ex4()
    // td2_ex5()
    td2_ex6()
  }
  def td1_ex1(): Unit = {
    print("a : ")
    val a = scala.io.StdIn.readInt()
    print("b : ")
    val b = scala.io.StdIn.readInt()
    val res = if (a == b) (a + b) * 3 else a + b
    print(res)
  }
  def td1_ex2(): Unit = {
    val nom = scala.io.StdIn.readLine("Nom : ")
    print("Age : ")
    val age = scala.io.StdIn.readInt()
    print("Moyenne : ")
    val moy = scala.io.StdIn.readFloat()
    println(f"Nom : $nom  Age : $age  Moyenne : $moy")
    println("Nom : " + nom + "Age : " + age + "Moyenne : " + moy)
    printf("Nom : %s Age : %d Moyenne : %.1f", nom, age, moy)
  }
  def td1_ex3(): Unit = {
    print("Entier 1 : ")
    val a: Int = scala.io.StdIn.readInt()
    print("Entier 2 : ")
    val b: Int = scala.io.StdIn.readInt()
    val diviseurs =
      for (i <- 1 to Math.min(a, b) if (a % i == 0 && b % i == 0)) yield i
    print(diviseurs.max)
  }
  def td1_ex4(): Unit = {
    print("n : ")
    val a: Int = scala.io.StdIn.readInt()
    val res =
      for (i <- 2 to a if (!(2 to i - 1).exists(k => i % k == 0))) yield i
    // val res = for(i <- 2 to a if((2 to i).filter(p => i%p==0))) yield i
    print(res.mkString(","))
  }
  def td1_ex5(): Unit = {
    var a = 0
    var s = 0
    var i = 0
    while (a != (-1)) {
      print("n : ")
      a = scala.io.StdIn.readInt()
      s += a
      i += 1
    }
    printf("%.2f", (s.toFloat + 1) / (i - 1))
  }
  def td1_ex6(): Unit = {
    print("n : ")
    val a: Int = scala.io.StdIn.readInt()
    val tab: Array[Float] = new Array[Float](a)
    tab.indices.foreach(k => tab(k) = scala.io.StdIn.readFloat())
    tab.foreach(k => print(k))
    println(tab.sum)
    println(tab.sum / tab.length)
    println(tab.min)
    println(tab.max)
    println(tab.sorted(Ordering[Float].reverse).mkString(","))
    // print(tab.mkString(","))
  }
  def td2_ex1(): Unit = {
    print("a : ")
    val a: Int = scala.io.StdIn.readInt()
    print("b : ")
    val b: Int = scala.io.StdIn.readInt()
    print("c : ")
    val c: Int = scala.io.StdIn.readInt()
    print(max3(a, b, c))
    def max3(a: Int, b: Int, c: Int): Int = {

      def max2(a: Int, B: Int): Int = {
        if (a > b) a else b
      }
      max2(a, max2(b, c))
    }
  }
  def td2_ex2(): Unit = {
    print("a : ")
    val a: Int = scala.io.StdIn.readInt()
    print("b : ")
    val b: Int = scala.io.StdIn.readInt()
    print("c : ")
    val c: Int = scala.io.StdIn.readInt()

    print(max_3(a, b, c, max_2))
    def max_2(a: Int, b: Int): Int = {
      if (a > b) a else b
    }
    def max_3(a: Int, b: Int, c: Int, cmp: (Int, Int) => Int): Int = {
      cmp(a, cmp(b, c))
    }
  }
  def td2_ex3(): Unit = {
    def multiple(a: Int): (Int, Int) => Int = (b: Int, c: Int) => a * b * c
    val tripler = multiple(3)
    print(tripler(10, 2))
  }
  def td2_ex4(): Unit = {
    def fzero(x: String, f: String => Unit): String = { f(x); x }
    def print_ln(x: String): Unit = {
      println(x)
    }
    println(fzero("hello world", f = print_ln))
  }
  def td2_ex5(): Unit = {
    val tab = Array[Int](1, 2, 3, -3, 5, -9)
    tab.filter(k => k > 0).foreach(k => print(f"$k\t"))
    def only_negatif(a: Int): Boolean = {
      if (a < 0) true else false
    }
    def affiche(tab: Array[Int], f: Int => Boolean): Unit = {
      tab.foreach(k => if (f(k)) print(f"$k\t"))
    }
    affiche(tab, only_negatif)
  }
  def td2_ex6(): Unit = {
    def conditionelle(
        x: String,
        p: String => Boolean,
        f: String => String
    ): Boolean = {
      if (p(x)) {
        f(x)
      } else {
        x
      }
    }
    def p(x: String): Boolean = {
      True
    }
    def f(x: String): String = {
      "Hello"
    }
    print(conditionelle("Hello world", p, f))
  }
  def ds_ex3(): Unit = {
    val tab = Array("hello", "hi", "fklm", "ali")
    //1
    def filtre(tab: Array[String], f: String => Boolean): Array[String] = {
      tab.filter(f)
    }

    //2
    filtre(tab, _.length() % 2 == 0).foreach(println)
    filtre(tab, ch => ch.startsWith("a")) foreach println
    //3
    def filtregen[A](tab: Array[A], f: A => Boolean): Array[A] = {
      tab.filter(f)
    }
    val tab2 = Array(3, 4, 7, 5, -8)
    filtregen(tab2, x => x > 0).foreach(println)

  }
}
