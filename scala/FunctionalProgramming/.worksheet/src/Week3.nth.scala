package Week3
import Week3._

object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(195); 
  def nth[T](n: Int, xs: List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail);System.out.println("""nth: [T](n: Int, xs: Week3.List[T])T""");$skip(61); 

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : Week3.Cons[Int] = """ + $show(list ));$skip(15); val res$0 = 
  nth(2, list);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  nth(4, list);System.out.println("""res1: Int = """ + $show(res$1));$skip(16); val res$2 = 
  nth(-1, list);System.out.println("""res2: Int = """ + $show(res$2))}

}
