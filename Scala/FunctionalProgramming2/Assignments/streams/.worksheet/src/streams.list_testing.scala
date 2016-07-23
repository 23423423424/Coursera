package streams

object list_testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(54); 
	val x = List();System.out.println("""x  : List[Nothing] = """ + $show(x ));$skip(25); 
	val y = List.empty[Int];System.out.println("""y  : List[Int] = """ + $show(y ))}
}
