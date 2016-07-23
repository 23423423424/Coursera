package Week4ComposingFutures

object foldingPlaying {
	def double(x: Int): Int =  x * 2          //> double: (x: Int)Int
	
	val noTimes = 3                           //> noTimes  : Int = 3
	val hello = "Hello"                       //> hello  : String = Hello
	val ns = (1 to noTimes).toList            //> ns  : List[Int] = List(1, 2, 3)
	val attempts = ns.map(_ => () => noTimes) //> attempts  : List[() => String] = List(<function0>, <function0>, <function0>)
                                                  //| 
	print(attempts)                           //> List(<function0>, <function0>, <function0>)
	//ns map double
	val failed = -1                           //> failed  : String = Failed
	val result = attempts.foldLeft(failed)(double)
	
}