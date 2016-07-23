package week3

object for_loops {
	for(i <- 1 until 3; j <- "abc") println(i + " " + j)
                                                  //> 1 a
                                                  //| 1 b
                                                  //| 1 c
                                                  //| 2 a
                                                  //| 2 b
                                                  //| 2 c
	
	(1 until 3) foreach (i => "abc" foreach (j => println(i + " " + j)))
                                                  //> 1 a
                                                  //| 1 b
                                                  //| 1 c
                                                  //| 2 a
                                                  //| 2 b
                                                  //| 2 c
}