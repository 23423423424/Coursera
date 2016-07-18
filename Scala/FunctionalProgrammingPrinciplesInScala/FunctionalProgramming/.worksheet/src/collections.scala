object collections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  val fruit = List("apples", "oranges");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(30); 
  val nums = List(1, 2, 3, 4);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(21); 
  val empty = List();System.out.println("""empty  : List[Nothing] = """ + $show(empty ));$skip(64); 
  val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1));System.out.println("""diag3  : List[List[Int]] = """ + $show(diag3 ));$skip(38); 

  val nums2 = 1 :: (2 :: (3 :: Nil));System.out.println("""nums2  : List[Int] = """ + $show(nums2 ));$skip(33); 
  val nums3 = 1 :: 2 :: 3 :: Nil;System.out.println("""nums3  : List[Int] = """ + $show(nums3 ));$skip(42); 
  val nums4 = Nil.::(4).::(3).::(2).::(1);System.out.println("""nums4  : List[Int] = """ + $show(nums4 ));$skip(123); 
  
  def isort(xs: List[Int]): List[Int] = xs match {
  	case List() => List()
  	case y :: ys => insert(y, isort(ys))
  };System.out.println("""isort: (xs: List[Int])List[Int]""");$skip(155); 
  
  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  	case List() => List(x)
  	case y :: ys => if(x <= y) x :: xs else y :: insert(x, ys)
  };System.out.println("""insert: (x: Int, xs: List[Int])List[Int]""")}
  
  
  
}
