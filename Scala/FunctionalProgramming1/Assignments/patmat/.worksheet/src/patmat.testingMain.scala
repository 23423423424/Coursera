package patmat

import common._

/**
 * Assignment 4: Huffman coding
 *
 */
object testingMain {

  abstract class CodeTree
  case class Fork(left: CodeTree, right: CodeTree, chars: List[Char], weight: Int) extends CodeTree
  case class Leaf(char: Char, weight: Int) extends CodeTree;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(440); 
  def weight(tree: CodeTree): Int = tree match {
    case Fork(left, right, chars, weight) => weight
    case Leaf(char, weight)               => weight
  };System.out.println("""weight: (tree: patmat.testingMain.CodeTree)Int""");$skip(142); 
  def chars(tree: CodeTree): List[Char] = tree match {
    case Fork(_, _, chars, _) => chars
    case Leaf(char, _)        => List(char)
  };System.out.println("""chars: (tree: patmat.testingMain.CodeTree)List[Char]""");$skip(136); 
  def makeCodeTree(left: CodeTree, right: CodeTree) =
    Fork(left, right, chars(left) ::: chars(right), weight(left) + weight(right));System.out.println("""makeCodeTree: (left: patmat.testingMain.CodeTree, right: patmat.testingMain.CodeTree)patmat.testingMain.Fork""");$skip(62); 
    
  def string2Chars(str: String): List[Char] = str.toList;System.out.println("""string2Chars: (str: String)List[Char]""");$skip(136); 
  
  def times(chars: List[Char]): List[(Char, Int)] =
    chars.groupBy(chars => chars).map(chars => (chars._1, chars._2.size)).toList;System.out.println("""times: (chars: List[Char])List[(Char, Int)]""");$skip(130); 
    
  def makeOrderedLeafList(freqs: List[(Char, Int)]): List[Leaf] =
    freqs.sortWith(_._2 < _._2).map(f => Leaf(f._1, f._2));System.out.println("""makeOrderedLeafList: (freqs: List[(Char, Int)])List[patmat.testingMain.Leaf]""");$skip(96); 
    
  def singleton(trees: List[CodeTree]): Boolean =
    if (trees.size == 1) true else false;System.out.println("""singleton: (trees: List[patmat.testingMain.CodeTree])Boolean""");$skip(224); 
    
  def combine(trees: List[CodeTree]): List[CodeTree] = trees match {
    case left :: right :: chars => (makeCodeTree(left, right) :: chars) sortWith (weight(_) < weight(_))
    case _                      => trees
  };System.out.println("""combine: (trees: List[patmat.testingMain.CodeTree])List[patmat.testingMain.CodeTree]""");$skip(106); 
  
  def info(trees: List[CodeTree]): Boolean = {
    println(trees)
    println(trees.size)
    true
  };System.out.println("""info: (trees: List[patmat.testingMain.CodeTree])Boolean""")}
  
}
