package Week6

object sets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
	val fruit = Set("apple","banana","pear");System.out.println("""fruit  : scala.collection.immutable.Set[String] = """ + $show(fruit ));$skip(24); 
	val s = (1 to 6).toSet;System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(15); val res$0 = 
	s map (_ + 2);System.out.println("""res0: scala.collection.immutable.Set[Int] = """ + $show(res$0));$skip(12); val res$1 = 
	s.nonEmpty;System.out.println("""res1: Boolean = """ + $show(res$1))}
}
