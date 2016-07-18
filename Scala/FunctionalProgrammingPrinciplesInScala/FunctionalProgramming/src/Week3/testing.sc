package Week3

object testing {
	
	val f: Function1[Int,String] = myInt => "my int: " + myInt.toString
                                                  //> f  : Int => String = <function1>
	f(4)                                      //> res0: String = my int: 4
	
	val g = () => println("Hello")            //> g  : () => Unit = <function0>
	
	g()                                       //> Hello
	
	def h(myInt:Int): String =
	 myInt.toString + " my int."              //> h: (myInt: Int)String

}