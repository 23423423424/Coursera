object sweepTesting {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 

  def max(a: Float, b: Float): Float = if (a > b) a else b

  sealed abstract class Tree {
    def maxPrevious: Float
  }

  case class Node(left: Tree, right: Tree) extends Tree {
    val maxPrevious = max(left.maxPrevious, right.maxPrevious)
  }

  case class Leaf(from: Int, until: Int, maxPrevious: Float) extends Tree;System.out.println("""max: (a: Float, b: Float)Float""");$skip(286); val res$0 = 
  
  Node(Leaf(1,2,0);System.out.println("""res0: <error> = """ + $show(res$0))}
  
}
