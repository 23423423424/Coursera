package week3

object case_testing {
		def testing(x: Int) = x match {
			case x if(x < 5)  => println(x*2)
			case x if(x == 7) => println(x * 3)
			case _ => println(x)
		}                                 //> testing: (x: Int)Unit
		
		testing(7)                        //> 21

}