package reductions

object foldLeftTesting {

  val x = Array('(', '1', '(', ')', ')')          //> x  : Array[Char] = Array((, 1, (, ), ))
  x.filter(x => x == '(' || x == ')').foldLeft(0)((x, y) => y match {
    case '(' => if (x < 0) -1 else x + 1
    case ')' => if (x <= 0) -1 else x - 1
    case _   => x
  }) == 0                                         //> res0: Boolean = true
  val y = x                                       //> y  : Array[Char] = Array((, 1, (, ), ))
  val y1 = x                                      //> y1  : Array[Char] = Array((, 1, (, ), ))
  println(x)                                      //> [C@5c9ddf21
  x.foldLeft(0)((x, y) => y match {
    case '(' => if (x >= 0) x + 1 else 0
    case _   => x
  })                                              //> res1: Int = 2

  x.foldLeft(0)((x, y) => y match {
    case '(' => if (x < 0) -1 else x + 1
    case ')' => if (x <= 0) -1 else x - 1
    case _   => x
  })                                              //> res2: Int = 0

  y1.foldRight(0)((x, y) => y match {
    case '(' => if (x <= 0) -1 else x - 1
    case ')' => if (x < 0) -1 else x + 1
    case _   => x + 1
  })                                              //> res3: Int = 41

  y.map(x => if ((x == '(') || (x == ')')) x else -1).toList

}