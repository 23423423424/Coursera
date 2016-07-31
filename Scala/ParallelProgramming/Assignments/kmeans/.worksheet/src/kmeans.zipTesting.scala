package kmeans

object zipTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
	val x = Array(1,2,3);System.out.println("""x  : Array[Int] = """ + $show(x ));$skip(22); 
	val y = Array(4,5,6);System.out.println("""y  : Array[Int] = """ + $show(y ));$skip(18); 
	val z = x.zip(y);System.out.println("""z  : Array[(Int, Int)] = """ + $show(z ));$skip(36); val res$0 = 
	z.map(x => (x._1 < 5 && x._2 > 2));System.out.println("""res0: Array[Boolean] = """ + $show(res$0));$skip(19); val res$1 = 
	z.contains(false);System.out.println("""res1: Boolean = """ + $show(res$1))}
	
}
