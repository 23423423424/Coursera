package Week2

object sheet1 {

  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else a + sumInts(a + 1, b) //> sumInts: (a: Int, b: Int)Int

  sumInts(2, 3) //> res0: Int = 5

  def cube(x: Int): Int = x * x * x //> cube: (x: Int)Int

  def sumCubes(a: Int, b: Int): Int =
    if (a > b) 0
    else cube(a) + sumCubes(a + 1, b) //> sumCubes: (a: Int, b: Int)Int

  /*
	def sumFact(a: Int, b: Int): Int =
		if(a>b) 0
		else fact(a) + sumFact(a+1,b)
		*/

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b) //> sum: (f: Int => Int, a: Int, b: Int)Int
    

}