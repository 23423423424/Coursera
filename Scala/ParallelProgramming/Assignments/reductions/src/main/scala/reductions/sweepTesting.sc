object sweepTesting {

  def max(a: Float, b: Float): Float = if (a > b) a else b

  sealed abstract class Tree {
    def maxPrevious: Float
  }

  case class Node(left: Tree, right: Tree) extends Tree {
    val maxPrevious = max(left.maxPrevious, right.maxPrevious)
  }

  case class Leaf(from: Int, until: Int, maxPrevious: Float) extends Tree
  
  Node(Leaf(1,2,0)
  
}