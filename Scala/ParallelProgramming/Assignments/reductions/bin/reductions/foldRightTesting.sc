package reductions

object foldRightTesting {

  val y1 = Array('(', '1', '(', ')',')')          //> y1  : Array[Char] = Array((, 1, (, ), ))

  val x = List(1, 2, 3, 4)                        //> x  : List[Int] = List(1, 2, 3, 4)
  x.foldRight(0)((x, y) => {
    println((x, y))
    x + y
  })                                              //> (4,0)
                                                  //| (3,4)
                                                  //| (2,7)
                                                  //| (1,9)
                                                  //| res0: Int = 10
  /**
  	(0,)) 1
  	(1,)) 2
   **/
  y1.foldRight(0)((x, y) => x match {
    case '(' => if (y <= 0) -1 else y - 1
    case ')' => if (y < 0) -1 else y + 1
    case _   => y
  })                                              //> res1: Int = 0
}