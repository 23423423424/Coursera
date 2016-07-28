object synchronizedBlock {
	private val x = new AnyRef {}
	private var uidCount = 0L
	def getUniqueId(): Long = x.synchronized {
		uidCount = uidCount + 1
		uidCount
	}
}