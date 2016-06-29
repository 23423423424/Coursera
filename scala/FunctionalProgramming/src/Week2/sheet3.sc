package Week2

object sheet3 {

	def sum(f: Int => Int): (Int, Int) => Int = {
		def sumF(a: Int, b: Int): Int =
			if(a>b) 0
			else f(a) + sumF(a+1, b)
		sumF
	}                                         //> sum: (f: Int => Int)(Int, Int) => Int
	
	def sumInts  = sum(x=>x)                  //> sumInts: => (Int, Int) => Int
	sumInts(2,3)                              //> res0: Int = 5
	
	def sum1(f: Int => Int)(a: Int, b: Int): Int =
		if(a>b) 0
		else f(a) + sum1(f)(a+1, b)       //> sum1: (f: Int => Int)(a: Int, b: Int)Int
	
	sum1(x => x)(2,3)                         //> res1: Int = 5
	
	def product(f: Int => Int)(a: Int, b: Int): Int =
		if(a > b) 1
		else f(a) * product(f)(a+1,b)     //> product: (f: Int => Int)(a: Int, b: Int)Int
		
	product(x => x)(2,3)                      //> res2: Int = 6
	
	def factorial(n: Int) = product(x => x)(1, n)
                                                  //> factorial: (n: Int)Int
	
	factorial(5)                              //> res3: Int = 120
	
	def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
		if(a > b) zero
		else combine(f(a), mapReduce(f, combine, zero)(a+1,b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
                                                  
  def product1(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x,y) => x * y, 1)(a,b)
                                                  //> product1: (f: Int => Int)(a: Int, b: Int)Int
                                                  
  product1(x => x)(3,4)                           //> res4: Int = 12
  
  def fact1(n: Int) = product1(x => x + 1)(1,n)   //> fact1: (n: Int)Int
  
  fact1(5)                                        //> res5: Int = 720
	
}