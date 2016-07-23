package quickcheck

import common._

import org.scalacheck._
import Arbitrary._
import Gen._
import Prop._

abstract class QuickCheckHeap extends Properties("Heap") with IntHeap {

  lazy val genHeap: Gen[H] = for {
    a <- arbitrary[Int]
    h <- oneOf(Gen.const(empty), genHeap)
  } yield insert(a, h)

  implicit lazy val arbHeap: Arbitrary[H] = Arbitrary(genHeap)

  property("min1") = forAll { (a: Int) =>
    val h = insert(a, empty)
    findMin(h) == a
  }

  property("gen1") = forAll { (h: H) =>
    val m = if (isEmpty(h)) 0 else findMin(h)
    findMin(insert(m, h)) == m
  }

  property("insertingElements") = forAll { (a1: Int, a2: Int) =>
    val min = if (a1 < a2) a1 else a2
    var h = insert(a1, empty)
    h = insert(a2, h)
    val minh = findMin(h)
    min == minh
  }

  property("insertionDeletionEmpty") = forAll { (a: Int) =>
    val h = insert(a, empty)
    deleteMin(h)
    isEmpty(h) == true
  }

  property("findMinSorted") = forAll { (h: H) =>
    def isSorted(h: H): Boolean = {
      if (isEmpty(h)) true
      else {
        val m = findMin(h)
        val h2 = deleteMin(h)
        if (isEmpty(h2)) true
        else {
          (m <= findMin(h2) && isSorted(h2))
        }
      }
    }
    isSorted(h)
  }

  property("melding") = forAll { (h1: H, h2: H) =>
    val minh1 = findMin(h1)
    val minh2 = findMin(h2)
    val h3 = meld(h1, h2)
    val minh3 = findMin(h3)
    minh3 == minh1 || minh3 == minh2
  }
  ///////
  property("meld") = forAll { (h1: H, h2: H) =>
    def heapEqual(h1: H, h2: H): Boolean =
      if (isEmpty(h1) && isEmpty(h2)) true
      else {
        val m1 = findMin(h1)
        val m2 = findMin(h2)
        m1 == m2 && heapEqual(deleteMin(h1), deleteMin(h2))
      }
    heapEqual(meld(h1, h2),
      meld(deleteMin(h1), insert(findMin(h1), h2)))
  }
  
  property("nw1") = forAll { (h1: H, h2: H) =>
    val m1 = findMin(h1)
    val m2 = findMin(h2)
    val min = m1.min(m2)
    findMin(meld(deleteMin(h1), insert(min, h2))) == min
  }
 
}
