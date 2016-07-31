package reductions

object traversaltesting {
  val x = List('(', ')', '(')                     //> x  : List[Char] = List((, ), ()
  val y = List(')', '(', ')')                     //> y  : List[Char] = List(), (, ))
  def value(start: Int, end: Int, x: List[Char], left: Int, right: Int): (Int, Int) = {
    if (start >= end) {
      println("(left,right) = " + (left, right))
      (left, right)
    } else x(start) match {
      case '('               => value(start + 1, end, x, left + 1, right)
      case ')' if (left > 0) => value(start + 1, end, x, left - 1, right)
      case ')'               => value(start + 1, end, x, left, right - 1)
      case _                 => value(start + 1, end, x, left, right)
    }
  }                                               //> value: (start: Int, end: Int, x: List[Char], left: Int, right: Int)(Int, Int
                                                  //| )

  println(0, x.length)                            //> (0,3)
  val q = value(0, x.length, x, 0, 0)             //> (left,right) = (1,0)
                                                  //| q  : (Int, Int) = (1,0)
  val q1 = value(0, y.length, y, 0, 0)            //> (left,right) = (0,-1)
                                                  //| q1  : (Int, Int) = (0,-1)
  println(q, q1)                                  //> ((1,0),(0,-1))

}