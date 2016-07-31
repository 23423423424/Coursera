package reductions

object traversaltesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  val x = List('(', ')', '(');System.out.println("""x  : List[Char] = """ + $show(x ));$skip(30); 
  val y = List(')', '(', ')');System.out.println("""y  : List[Char] = """ + $show(y ));$skip(511); 
  def value(start: Int, end: Int, x: List[Char], left: Int, right: Int): (Int, Int) = {
    if (start >= end) {
      println("(left,right) = " + (left, right))
      (left, right)
    } else x(start) match {
      case '('               => value(start + 1, end, x, left + 1, right)
      case ')' if (left > 0) => value(start + 1, end, x, left - 1, right)
      case ')'               => value(start + 1, end, x, left, right - 1)
      case _                 => value(start + 1, end, x, left, right)
    }
  };System.out.println("""value: (start: Int, end: Int, x: List[Char], left: Int, right: Int)(Int, Int)""");$skip(24); 

  println(0, x.length);$skip(38); 
  val q = value(0, x.length, x, 0, 0);System.out.println("""q  : (Int, Int) = """ + $show(q ));$skip(39); 
  val q1 = value(0, y.length, y, 0, 0);System.out.println("""q1  : (Int, Int) = """ + $show(q1 ));$skip(17); 
  println(q, q1)}

}
