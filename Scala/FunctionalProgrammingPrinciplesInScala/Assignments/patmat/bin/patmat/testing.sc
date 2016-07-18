package patmat

object testing {
	val x = List(1,2,3,4,1,1,2)               //> x  : List[Int] = List(1, 2, 3, 4, 1, 1, 2)
	//chars.groupBy(x => x).map(x => (x._1, x._2.size)).toList
	var z = x.groupBy(x => x).map(x => (x._1, x._2.size)).toList
                                                  //> z  : List[(Int, Int)] = List((2,2), (4,1), (1,3), (3,1))
	x.groupBy(x => x)                         //> res0: scala.collection.immutable.Map[Int,List[Int]] = Map(2 -> List(2, 2), 4
                                                  //|  -> List(4), 1 -> List(1, 1, 1), 3 -> List(3))
  var y = x.groupBy(x => x)                       //> y  : scala.collection.immutable.Map[Int,List[Int]] = Map(2 -> List(2, 2), 4 
                                                  //| -> List(4), 1 -> List(1, 1, 1), 3 -> List(3))
  println(y.head)                                 //> (2,List(2, 2))
  
  x.sortWith(_<_)                                 //> res1: List[Int] = List(1, 1, 1, 2, 2, 3, 4)
  
  println(z)                                      //> List((2,2), (4,1), (1,3), (3,1))
  z.sortWith( _._2 < _._2)                        //> res2: List[(Int, Int)] = List((4,1), (3,1), (2,2), (1,3))
  
  var z1 = 1                                      //> z1  : Int = 1
  if(z1 == 1) println("Hello")                    //> Hello
  
  def cases(n: Int, z: Int): Int = {
  	n
  }                                               //> cases: (n: Int, z: Int)Int
  
}