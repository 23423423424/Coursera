package streams

object testing_vectors {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
	val x = Vector(Vector(1,2), Vector(3,4));System.out.println("""x  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[Int]] = """ + $show(x ));$skip(46); 
	val vector = x.indexWhere(_.indexOf(1) >= 0);System.out.println("""vector  : Int = """ + $show(vector ));$skip(37); 
	val position = x(vector).indexOf(2);System.out.println("""position  : Int = """ + $show(position ));$skip(7); val res$0 = 
	(1,0);System.out.println("""res0: (Int, Int) = """ + $show(res$0))}
}
