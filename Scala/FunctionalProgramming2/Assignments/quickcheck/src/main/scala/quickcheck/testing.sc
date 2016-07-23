package quickcheck

import common._

import org.scalacheck._
import Arbitrary._
import Gen._
import Prop._
import Math._

object testing {
	val x = List.fill(2)("")                  //> x  : List[String] = List("", "")
}