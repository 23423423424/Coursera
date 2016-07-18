package Week2

object sheet2 {

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)                  //> sum: (f: Int => Int, a: Int, b: Int)Int
 
 
 	def sumInts(a: Int, b:Int) = sum(id, a, b)//> sumInts: (a: Int, b: Int)Int
 	def sumFactorials(a: Int, b: Int) = sum(fact, a, b)
                                                  //> sumFactorials: (a: Int, b: Int)Int

 	def id(x: Int): Int = x                   //> id: (x: Int)Int
 	def fact(x: Int): Int =
	 	if(x == 0) 1
	 	else fact(x-1)                    //> fact: (x: Int)Int
	 	
	def str = "abc"                           //> str: => String
	println(str)                              //> abc

	println("abc")                            //> abc
	
	(x: Int) => x * x * x                     //> res0: Int => Int = <function1>
	(x: Int, y:Int) => x + y                  //> res1: (Int, Int) => Int = <function2>
	
	def sumInts1(a: Int, b:Int) = sum(x => x, a, b)
                                                  //> sumInts1: (a: Int, b: Int)Int
  def sumCubes1(a: Int, b: Int) = sum(x => x * x * x, a, b)
                                                  //> sumCubes1: (a: Int, b: Int)Int
	
	sumCubes1(2,3)                            //> res2: Int = 35
	
	//tail recursive version of the sum function
	def sumTail(f: Int => Int, a: Int, b: Int): Int = {
		def loop(a: Int, acc: Int): Int = {
			if(a > b) acc
			else loop(a + 1, f(a) + acc)
		}
		loop(a,0)
	}                                         //> sumTail: (f: Int => Int, a: Int, b: Int)Int
	
	sumTail(x => x, 2, 3)                     //> res3: Int = 5
	
	
	
	
	
	
	

}