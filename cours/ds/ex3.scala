object Main {
  def main(args: Array[String]): Unit = {
    val res3: Array[Any] = Array(0, 1, 2, 3, 4, -14, "String")
    print(filtre(res3, test_element).mkString(", "))
  }
  def filtre(tab: Array[Any], f: Any => Boolean): Array[Any] = {
    val returned_tab = new Array[Any](tab.length)
    var index=0
    tab.foreach(i =>
      println(f(i))
      if (f(i)) {
        returned_tab(index) = i
        index+=1
      }
    )
    returned_tab
  }
  def test_element(x: Any): Boolean = {
    if (x.getClass().getSimpleName().equals("Integer")) {
      if (Integer.parseInt(x.toString()) > 0) { 
        true }
      else { 
        false }
    }
    else if (x.getClass().getSimpleName().equals("String")) {
      if (x.toString().length() % 2 == 0 || x.toString().charAt(0) == 'a') {
        true
      } else { false }
    }
    else{
        false
    }
  }
}
