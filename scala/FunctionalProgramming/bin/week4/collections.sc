object collections {
  val fruit = List("apples", "oranges")           //> fruit  : List[String] = List(apples, oranges)
  val nums = List(1, 2, 3, 4)                     //> nums  : List[Int] = List(1, 2, 3, 4)
  val empty = List()                              //> empty  : List[Nothing] = List()
  val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
                                                  //> diag3  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
                                                  //| 

  val nums2 = 1 :: (2 :: (3 :: Nil))              //> nums2  : List[Int] = List(1, 2, 3)
  val nums3 = 1 :: 2 :: 3 :: Nil                  //> nums3  : List[Int] = List(1, 2, 3)
  val nums4 = Nil.::(4).::(3).::(2).::(1)         //> nums4  : List[Int] = List(1, 2, 3, 4)
  
  def isort(xs: List[Int]): List[Int] = xs match {
  	case List() => List()
  	case y :: ys => insert(y, isort(ys))
  }                                               //> isort: (xs: List[Int])List[Int]
  
  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  	case List() => List(x)
  	case y :: ys => if(x <= y) x :: xs else y :: insert(x, ys)
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]
  
  
  
}