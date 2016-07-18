import Week3.Rational
//import Week3._ imports everything that is defined in the package
//import Week3.{Rational, Hello} imports both Rational and Hello

object sheet5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(191); val res$0 = 
  new Rational(1, 2);System.out.println("""res0: Week3.Rational = """ + $show(res$0));$skip(49); 

  def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(34); 
  //error("test")

  val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(20); 
  val y: String = x;System.out.println("""y  : String = """ + $show(y ));$skip(88); 
  //val z: Int = x

  def boolean_testing(x: Int) =
    if (x == 1) true
    else false;System.out.println("""boolean_testing: (x: Int)Boolean""");$skip(22); val res$1 = 

  boolean_testing(1);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(26); val res$2 = 

  if (true) 1 else false;System.out.println("""res2: AnyVal = """ + $show(res$2))}

}
