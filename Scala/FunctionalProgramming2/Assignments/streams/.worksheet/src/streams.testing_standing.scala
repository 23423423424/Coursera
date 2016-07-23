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
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(407); 
  val x = Block(Pos(1,2),Pos(1,2));System.out.println("""x  : streams.testing_standing.Block = """ + $show(x ));$skip(13); 
  println(x);$skip(12); val res$0 = 
  
  0 to 4;System.out.println("""res0: scala.collection.immutable.Range.Inclusive = """ + $show(res$0));$skip(31); 
  
  val q = List(1,2,3,4,5,6);System.out.println("""q  : List[Int] = """ + $show(q ));$skip(23); val res$1 = 
  q.filter(x => x > 3);System.out.println("""res1: List[Int] = """ + $show(res$1))}
  
  
  
  
  
}
