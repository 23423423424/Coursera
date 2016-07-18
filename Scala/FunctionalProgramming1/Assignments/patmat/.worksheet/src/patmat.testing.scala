package patmat

object testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
	val x = List(1,2,3,4,1,1,2);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(122); 
	//chars.groupBy(x => x).map(x => (x._1, x._2.size)).toList
	var z = x.groupBy(x => x).map(x => (x._1, x._2.size)).toList;System.out.println("""z  : List[(Int, Int)] = """ + $show(z ));$skip(19); val res$0 = 
	x.groupBy(x => x);System.out.println("""res0: scala.collection.immutable.Map[Int,List[Int]] = """ + $show(res$0));$skip(28); 
  var y = x.groupBy(x => x);System.out.println("""y  : scala.collection.immutable.Map[Int,List[Int]] = """ + $show(y ));$skip(18); 
  println(y.head);$skip(21); val res$1 = 
  
  x.sortWith(_<_);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(16); 
  
  println(z);$skip(27); val res$2 = 
  z.sortWith( _._2 < _._2);System.out.println("""res2: List[(Int, Int)] = """ + $show(res$2));$skip(16); 
  
  var z1 = 1;System.out.println("""z1  : Int = """ + $show(z1 ));$skip(31); 
  if(z1 == 1) println("Hello");$skip(49); 
  
  def cases(n: Int, z: Int): Int = {
  	n
  };System.out.println("""cases: (n: Int, z: Int)Int""")}
  
}
