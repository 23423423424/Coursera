package calculator

object map_testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  val x = Map((1 -> 3), (2 -> 4));System.out.println("""x  : scala.collection.immutable.Map[Int,Int] = """ + $show(x ));$skip(7); val res$0 = 
  x(1);System.out.println("""res0: Int = """ + $show(res$0));$skip(12); 
  var y = 3;System.out.println("""y  : Int = """ + $show(y ));$skip(17); 
  val q = y -> 2;System.out.println("""q  : (Int, Int) = """ + $show(q ));$skip(17); 
  val x1 = (3,2);System.out.println("""x1  : (Int, Int) = """ + $show(x1 ));$skip(12); val res$1 = 
  Map(x1,q);System.out.println("""res1: scala.collection.immutable.Map[Int,Int] = """ + $show(res$1));$skip(10); val res$2 = 
  x1 == q;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(13); 
  println(q);$skip(39); 
 	val xs = Map(1 -> 2, 2 -> 3, 3 -> 4);System.out.println("""xs  : scala.collection.immutable.Map[Int,Int] = """ + $show(xs ));$skip(17); 
	val ys = xs - 1;System.out.println("""ys  : scala.collection.immutable.Map[Int,Int] = """ + $show(ys ));$skip(32); 
	val zs = xs.filterKeys(_ != 1);System.out.println("""zs  : scala.collection.immutable.Map[Int,Int] = """ + $show(zs ))}
}
