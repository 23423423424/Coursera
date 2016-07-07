package week4
// Peano numbers
object naturalNumbers {
  println("Welcome to the Scala worksheet")
}

abstract class Nat{
	def isZero: Boolean
	def predecessor: Nat
	def successor = new Succ(this)
	def + (that: Nat): Nat
	def - (that: Nat): Nat
}

object Zero extends Nat {
	def isZero = true
	def predecessor = throw new Error("0.predecssor")
	def +(that: Nat) = that
	def -(that: Nat) = if (that.isZero) this else throw new Error("0.-")
}

class Succ(n: Nat) extends Nat {
	def isZero = false
	def predcessor = n
	def +(that: Nat) = new Succ(n + that)
	def -(that: Nat) = if(that.isZero) this else n - that.predecessor

}