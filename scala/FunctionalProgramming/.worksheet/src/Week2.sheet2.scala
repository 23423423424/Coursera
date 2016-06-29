package Week2

object sheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(129); 

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(49); 
 
 
 	def sumInts(a: Int, b:Int) = sum(id, a, b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(54); 
 	def sumFactorials(a: Int, b: Int) = sum(fact, a, b);System.out.println("""sumFactorials: (a: Int, b: Int)Int""");$skip(27); 

 	def id(x: Int): Int = x;System.out.println("""id: (x: Int)Int""");$skip(60); 
 	def fact(x: Int): Int =
	 	if(x == 0) 1
	 	else fact(x-1);System.out.println("""fact: (x: Int)Int""");$skip(21); 
	 	
	def str = "abc";System.out.println("""str: => String""");$skip(14); 
	println(str);$skip(17); 

	println("abc");$skip(25); val res$0 = 
	
	(x: Int) => x * x * x;System.out.println("""res0: Int => Int = """ + $show(res$0));$skip(26); val res$1 = 
	(x: Int, y:Int) => x + y;System.out.println("""res1: (Int, Int) => Int = """ + $show(res$1));$skip(51); 
	
	def sumInts1(a: Int, b:Int) = sum(x => x, a, b);System.out.println("""sumInts1: (a: Int, b: Int)Int""");$skip(60); 
  def sumCubes1(a: Int, b: Int) = sum(x => x * x * x, a, b);System.out.println("""sumCubes1: (a: Int, b: Int)Int""");$skip(18); val res$2 = 
	
	sumCubes1(2,3);System.out.println("""res2: Int = """ + $show(res$2));$skip(207); 
	
	//tail recursive version of the sum function
	def sumTail(f: Int => Int, a: Int, b: Int): Int = {
		def loop(a: Int, acc: Int): Int = {
			if(a > b) acc
			else loop(a + 1, f(a) + acc)
		}
		loop(a,0)
	};System.out.println("""sumTail: (f: Int => Int, a: Int, b: Int)Int""");$skip(25); val res$3 = 
	
	sumTail(x => x, 2, 3);System.out.println("""res3: Int = """ + $show(res$3))}
	
	
	
	
	
	
	

}
