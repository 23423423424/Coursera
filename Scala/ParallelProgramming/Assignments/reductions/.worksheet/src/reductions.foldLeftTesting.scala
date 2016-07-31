package reductions

object foldLeftTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 

  val x = Array('(', '1', '(', ')', ')');System.out.println("""x  : Array[Char] = """ + $show(x ));$skip(181); val res$0 = 
  x.filter(x => x == '(' || x == ')').foldLeft(0)((x, y) => y match {
    case '(' => if (x < 0) -1 else x + 1
    case ')' => if (x <= 0) -1 else x - 1
    case _   => x
  }) == 0;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(12); 
  val y = x;System.out.println("""y  : Array[Char] = """ + $show(y ));$skip(13); 
  val y1 = x;System.out.println("""y1  : Array[Char] = """ + $show(y1 ));$skip(13); 
  println(x);$skip(100); val res$1 = 
  x.foldLeft(0)((x, y) => y match {
    case '(' => if (x >= 0) x + 1 else 0
    case _   => x
  });System.out.println("""res1: Int = """ + $show(res$1));$skip(143); val res$2 = 

  x.foldLeft(0)((x, y) => y match {
    case '(' => if (x < 0) -1 else x + 1
    case ')' => if (x <= 0) -1 else x - 1
    case _   => x
  });System.out.println("""res2: Int = """ + $show(res$2));$skip(149); val res$3 = 

  y1.foldRight(0)((x, y) => y match {
    case '(' => if (x <= 0) -1 else x - 1
    case ')' => if (x < 0) -1 else x + 1
    case _   => x + 1
  });System.out.println("""res3: Int = """ + $show(res$3));$skip(62); val res$4 = 

  y.map(x => if ((x == '(') || (x == ')')) x else -1).toList;System.out.println("""res4: List[Int] = """ + $show(res$4))}

}
