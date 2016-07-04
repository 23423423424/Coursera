package Week3

object sheet7{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
	def singleton[T](elem: T) = new Cons[T](elem, new Nil[T]);System.out.println("""singleton: [T](elem: T)Week3.Cons[T]""");$skip(19); val res$0 = 
	singleton[Int](1);System.out.println("""res0: Week3.Cons[Int] = """ + $show(res$0));$skip(26); val res$1 = 
	singleton[Boolean](true);System.out.println("""res1: Week3.Cons[Boolean] = """ + $show(res$1));$skip(14); val res$2 = 
	singleton(1);System.out.println("""res2: Week3.Cons[Int] = """ + $show(res$2));$skip(17); val res$3 = 
	singleton(true);System.out.println("""res3: Week3.Cons[Boolean] = """ + $show(res$3))}
	
}
