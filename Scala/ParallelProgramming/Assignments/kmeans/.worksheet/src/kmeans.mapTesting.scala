package kmeans

object mapTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
	val x = Array(1,2,3);System.out.println("""x  : Array[Int] = """ + $show(x ));$skip(32); 
	val z = x.map((_,Array)).toMap;System.out.println("""z  : scala.collection.immutable.Map[Int,Array.type] = """ + $show(z ));$skip(23); 
  val y = Array(1,2,3);System.out.println("""y  : Array[Int] = """ + $show(y ));$skip(17); 
  val k = z ++ y;System.out.println("""k  : scala.collection.immutable.Iterable[Any] = """ + $show(k ))}
  
	
	
	
}
