package patmat

import common._

/**
 * Assignment 4: Huffman coding
 *
 */
object testingMain {

  abstract class CodeTree
  case class Fork(left: CodeTree, right: CodeTree, chars: List[Char], weight: Int) extends CodeTree
  case class Leaf(char: Char, weight: Int) extends CodeTree
  def weight(tree: CodeTree): Int = tree match {
    case Fork(left, right, chars, weight) => weight
    case Leaf(char, weight)               => weight
  }                                               //> weight: (tree: patmat.testingMain.CodeTree)Int
  def chars(tree: CodeTree): List[Char] = tree match {
    case Fork(_, _, chars, _) => chars
    case Leaf(char, _)        => List(char)
  }                                               //> chars: (tree: patmat.testingMain.CodeTree)List[Char]
  def makeCodeTree(left: CodeTree, right: CodeTree) =
    Fork(left, right, chars(left) ::: chars(right), weight(left) + weight(right))
                                                  //> makeCodeTree: (left: patmat.testingMain.CodeTree, right: patmat.testingMain.
                                                  //| CodeTree)patmat.testingMain.Fork
    
  def string2Chars(str: String): List[Char] = str.toList
                                                  //> string2Chars: (str: String)List[Char]
  
  def times(chars: List[Char]): List[(Char, Int)] =
    chars.groupBy(chars => chars).map(chars => (chars._1, chars._2.size)).toList
                                                  //> times: (chars: List[Char])List[(Char, Int)]
    
  def makeOrderedLeafList(freqs: List[(Char, Int)]): List[Leaf] =
    freqs.sortWith(_._2 < _._2).map(f => Leaf(f._1, f._2))
                                                  //> makeOrderedLeafList: (freqs: List[(Char, Int)])List[patmat.testingMain.Leaf
                                                  //| ]
    
  def singleton(trees: List[CodeTree]): Boolean =
    if (trees.size == 1) true else false          //> singleton: (trees: List[patmat.testingMain.CodeTree])Boolean
    
  def combine(trees: List[CodeTree]): List[CodeTree] = trees match {
    case left :: right :: chars => (makeCodeTree(left, right) :: chars) sortWith (weight(_) < weight(_))
    case _                      => trees
  }                                               //> combine: (trees: List[patmat.testingMain.CodeTree])List[patmat.testingMain.
                                                  //| CodeTree]
  
  def info(trees: List[CodeTree]): Boolean = {
    println(trees)
    println(trees.size)
    true
  }                                               //> info: (trees: List[patmat.testingMain.CodeTree])Boolean
  
}