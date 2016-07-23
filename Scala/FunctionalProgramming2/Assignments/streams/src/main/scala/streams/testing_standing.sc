package streams

object testing_standing {
  case class Pos(x: Int, y: Int) {
    /** The position obtained by changing the `x` coordinate by `d` */
    def dx(d: Int) = copy(x = x + d)
    /** The position obtained by changing the `y` coordinate by `d` */
    def dy(d: Int) = copy(y = y + d)
  }
  case class Block(b1: Pos, b2: Pos) {
		def isStanding: Boolean = ???
  }
  val x = Block(Pos(1,2),Pos(1,2))                //> x  : streams.testing_standing.Block = Block(Pos(1,2),Pos(1,2))
  println(x)                                      //> Block(Pos(1,2),Pos(1,2))
  
  0 to 4                                          //> res0: scala.collection.immutable.Range.Inclusive = Range(0, 1, 2, 3, 4)
  
  val q = List(1,2,3,4,5,6)                       //> q  : List[Int] = List(1, 2, 3, 4, 5, 6)
  q.filter(x => x > 3)                            //> res1: List[Int] = List(4, 5, 6)
  
  
  
  
  
}