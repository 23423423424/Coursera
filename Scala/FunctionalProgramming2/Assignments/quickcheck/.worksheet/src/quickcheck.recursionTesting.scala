package quickcheck

object recursionTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  val h = Array(1, 2, 3, 4);System.out.println("""h  : Array[Int] = """ + $show(h ));$skip(16); 
  println(h(0));$skip(217); 
  def recursiveList(h: Array[Int]): List[Int] = ({
    var x = 0
    var x1 = h.toBuffer
    if (h.isEmpty) List()
    else {
      x1.remove(0)
      x = h(0)
      x*2 :: recursiveList(x1.toArray)
    }
  }).toList;System.out.println("""recursiveList: (h: Array[Int])List[Int]""");$skip(28); 
  println(recursiveList(h))}
    
}
