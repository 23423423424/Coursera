package reductions

object sliceTesting {
	val x = Array(1,2,3,4)                    //> x  : Array[Int] = Array(1, 2, 3, 4)
	val y = x.slice(0,2)                      //> y  : Array[Int] = Array(1, 2)
	y.zip(0 until 5 by 2)                     //> res0: Array[(Int, Int)] = Array((1,0), (2,2))
	2 / 0                                     //> java.lang.ArithmeticException: / by zero
                                                  //| 	at reductions.sliceTesting$$anonfun$main$1.apply$mcV$sp(reductions.slice
                                                  //| Testing.scala:7)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at reductions.sliceTesting$.main(reductions.sliceTesting.scala:3)
                                                  //| 	at reductions.sliceTesting.main(reductions.sliceTesting.scala)
	
}