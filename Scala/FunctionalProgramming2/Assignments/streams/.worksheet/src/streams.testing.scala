package streams

object testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  val x = Vector(1,2,3);System.out.println("""x  : scala.collection.immutable.Vector[Int] = """ + $show(x ));$skip(31); val res$0 = 
  x.indexWhere(x => x == 1, 0);System.out.println("""res0: Int = """ + $show(res$0));$skip(30); 
  val y = Vector(1,1,2,3,4,4);System.out.println("""y  : scala.collection.immutable.Vector[Int] = """ + $show(y ));$skip(112); val res$1 = 
  
  // finds the first index satisfying some predicate after the start position
  y.indexWhere(x => x == 4, 5);System.out.println("""res1: Int = """ + $show(res$1));$skip(95); val res$2 = 
  
  // find index of first occurrence of some value in this immutable sequence
  y.indexOf(4);System.out.println("""res2: Int = """ + $show(res$2))}
  
  
}
