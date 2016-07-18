package Week3

object sheet7{
	def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
                                                  //> singleton: [T](elem: T)Week3.Cons[T]
	singleton[Int](1)                         //> res0: Week3.Cons[Int] = Week3.Cons@3afa6240
	singleton[Boolean](true)                  //> res1: Week3.Cons[Boolean] = Week3.Cons@c487600
	singleton(1)                              //> res2: Week3.Cons[Int] = Week3.Cons@693b004c
	singleton(true)                           //> res3: Week3.Cons[Boolean] = Week3.Cons@2090b38d
	
}