package week1

object atomicThread {
	private var uidCount = 0L
	def getUniqueId(): Long = {
		uidCount = uidCount + 1
		uidCount
	}
	def startThread() = {
		val t = new Thread{
			override def run(){
				val uids = for (i <- 0 until 10) yield getUniqueId()
				println(uids)
			}
		}
		t.start()
		t
	}
	startThread()
	startThread()
}