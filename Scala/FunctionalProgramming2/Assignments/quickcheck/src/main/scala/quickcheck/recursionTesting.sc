package quickcheck

object recursionTesting {
  val h = Array(1, 2, 3, 4)                       //> h  : Array[Int] = Array(1, 2, 3, 4)
  println(h(0))                                   //> 1
  def recursiveList(h: Array[Int]): List[Int] = ({
    var x = 0
    var x1 = h.toBuffer
    if (h.isEmpty) List()
    else {
      x1.remove(0)
      x = h(0)
      x*2 :: recursiveList(x1.toArray)
    }
  }).toList                                       //> recursiveList: (h: Array[Int])List[Int]
  println(recursiveList(h))                       //> List(2, 4, 6, 8)
    
}