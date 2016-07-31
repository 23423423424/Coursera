package reductions

object caseTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 

  var y = List(1, 1, 2);System.out.println("""y  : List[Int] = """ + $show(y ));$skip(107); 
  def casetest(x: List[Int]): Int = x.head match {
    case x if x == 2 => 1
    case x if x == 1 => 2
  };System.out.println("""casetest: (x: List[Int])Int""");$skip(17); val res$0 = 
  
  casetest(y);System.out.println("""res0: Int = """ + $show(res$0))}
  

}
