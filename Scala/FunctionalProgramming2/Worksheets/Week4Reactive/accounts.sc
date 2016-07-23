package Week4Reactive

object accounts {
	def consolidated(accts: List[bankAccount]): Signal[Int] =
		Signal(accts.map(_.balance()).sum)
		
	val a, b = new bankAccount()
	val c = consolidated(List(a,b))
	c()
	a deposit 20
	c()
	val xchange = Signal(246.00)
	val inDollar = Signal(c() * xchange())
	inDollar()
	b withdraw 10
	inDollar()
}