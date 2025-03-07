package week4
import week4._
object nth {
  println("Function that takes an integer N and selects the Nth integer from" +
  " the list")                                    //> Function that takes an integer N and selects the Nth integer from the list
  def nth[T](n: Int, xs: List[T]): T =
  	if(xs.isEmpty) throw new IndexOutOfBoundsException
  	else if (n == 0) xs.head
  	else nth(n-1, xs.tail)                    //> nth: [T](n: Int, xs: week4.List[T])T
  	
  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : week4.Cons[Int] = week4.Cons@c487600
  nth(2,list)                                     //> res0: Int = 3
  
  nth(2,list)                                     //> res1: Int = 3
  
  nth(-1,list)                                    //> java.lang.IndexOutOfBoundsException
                                                  //| 	at week4.nth$$anonfun$main$1.nth$1(week4.nth.scala:7)
                                                  //| 	at week4.nth$$anonfun$main$1.apply$mcV$sp(week4.nth.scala:16)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week4.nth$.main(week4.nth.scala:3)
                                                  //| 	at week4.nth.main(week4.nth.scala)
  
}