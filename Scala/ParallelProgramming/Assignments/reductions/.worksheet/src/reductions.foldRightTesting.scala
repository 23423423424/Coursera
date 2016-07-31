package reductions

object foldRightTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 

  val y1 = Array('(', '1', '(', ')',')');System.out.println("""y1  : Array[Char] = """ + $show(y1 ));$skip(28); 

  val x = List(1, 2, 3, 4);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(64); val res$0 = 
  x.foldRight(0)((x, y) => {
    println((x, y))
    x + y
  });System.out.println("""res0: Int = """ + $show(res$0));$skip(179); val res$1 = 
  /**
  	(0,)) 1
  	(1,)) 2
   **/
  y1.foldRight(0)((x, y) => x match {
    case '(' => if (y <= 0) -1 else y - 1
    case ')' => if (y < 0) -1 else y + 1
    case _   => y
  });System.out.println("""res1: Int = """ + $show(res$1))}
}
