package Week2

object sheet3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(163); 

	def sum(f: Int => Int): (Int, Int) => Int = {
		def sumF(a: Int, b: Int): Int =
			if(a>b) 0
			else f(a) + sumF(a+1, b)
		sumF
	};System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(28); 
	
	def sumInts  = sum(x=>x);System.out.println("""sumInts: => (Int, Int) => Int""");$skip(14); val res$0 = 
	sumInts(2,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(92); 
	
	def sum1(f: Int => Int)(a: Int, b: Int): Int =
		if(a>b) 0
		else f(a) + sum1(f)(a+1, b);System.out.println("""sum1: (f: Int => Int)(a: Int, b: Int)Int""");$skip(21); val res$1 = 
	
	sum1(x => x)(2,3);System.out.println("""res1: Int = """ + $show(res$1));$skip(99); 
	
	def product(f: Int => Int)(a: Int, b: Int): Int =
		if(a > b) 1
		else f(a) * product(f)(a+1,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(25); val res$2 = 
		
	product(x => x)(2,3);System.out.println("""res2: Int = """ + $show(res$2));$skip(49); 
	
	def factorial(n: Int) = product(x => x)(1, n);System.out.println("""factorial: (n: Int)Int""");$skip(16); val res$3 = 
	
	factorial(5);System.out.println("""res3: Int = """ + $show(res$3));$skip(168); 
	
	def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
		if(a > b) zero
		else combine(f(a), mapReduce(f, combine, zero)(a+1,b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(141); 
                                                  
  def product1(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x * y, 1)(a,b);System.out.println("""product1: (f: Int => Int)(a: Int, b: Int)Int""");$skip(75); val res$4 = 
                                                  
  product1(x => x)(3,4);System.out.println("""res4: Int = """ + $show(res$4));$skip(51); 
  
  def fact1(n: Int) = product1(x => x + 1)(1,n);System.out.println("""fact1: (n: Int)Int""");$skip(14); val res$5 = 
  
  fact1(5);System.out.println("""res5: Int = """ + $show(res$5))}
	
}
