package reductions

object rangeTesting {
	val start = 1                             //> start  : Int = 1
	val end = 4                               //> end  : Int = 4
	start to end                              //> res0: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4)
	start until end                           //> res1: scala.collection.immutable.Range = Range(1, 2, 3)
	
}