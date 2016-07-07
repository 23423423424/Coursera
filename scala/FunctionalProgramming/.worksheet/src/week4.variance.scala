package week4

object variance {
	// C[T] is a parameterized type and A, B are types such that A <: B
	// three possible relations
	// C[A] <: C[B] C is covariant
	// C[A] >: C[B] C is contravariant
	// neither C[A] nor C[B] is a subtype of the other C is nonvariant
	// Scala lets you declare the variance of a type b anotating the type parameter:
	// class C[+A] {...} C is covariant
	// class C[-A] {...} C is contravariant
	// class C[A] {...} C is nonvariant
	// If A2 <: A1 and B1 <: B2 then
	// A1 => B1 <: A2 => B2
	
}
