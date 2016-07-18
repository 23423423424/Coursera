
object pureBooleans {

}

class Int{
	def + (that: Double): Double
	def + (that: Float): Float
	def + (that: Long): Long
	def + (that: Int): Int
	
	def << (cnt: Int): Int
	
	def & (that: Long): Long
	def & (that: Int): Int
	
	def == (that: Double): Boolean
	def == (that: Float): Boolean
	def == (that: Long): Boolean
}

object true extends Boolean{
	def ifThenElse[T](t: => T, e: => T) = t
}

object false extends Boolean {
	def ifThenElse[T](t: => T, e: => T) = e
}

abstract class Boolean {
	def ifThenElse[T](t: => T, e: => T): T
	def && (x: => Boolean): Boolean = ifThenElse(x, false)
	def || (x: => Boolean): Boolean = ifThenElse(true, x)
	def unary_!: Boolean = ifThenElse(false, true)
	def == (x: Boolean): Boolean = ifThenElse(x, x.unary_!)
	def != (x: Boolean): Boolean = ifThenElse(x.unary_!, x)
	def < (x: Boolean): Boolean = ifThenElse(false,x)
}
