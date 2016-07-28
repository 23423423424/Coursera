class Account(private var amount: Int = 0) {
  private val x = new AnyRef {}
  private var uidCount = 0L
  
  def getAmount = this.amount
  
  def getUniqueUid(): Long = x.synchronized {
    uidCount = uidCount + 1
    uidCount
  }
  val uid = getUniqueUid()
  private def lockAndTransfer(target: Account, n: Int) =
    this.synchronized {
      target.synchronized {
        this.amount -= n
        target.amount += n
      }
    }
  def transfer(target: Account, n: Int) =
  	if (this.uid < target.uid) this.lockAndTransfer(target, n)
  	else target.lockAndTransfer(this, -n)
  
}

def startThread(a: Account, b: Account, n: Int) = {
  val t = new Thread {
    override def run() {
      for (i <- 0 until n) {
        a.transfer(b, 1)
      }
    }
  }
  t.start()
  t
}

val a1 = new Account(50)
val a2 = new Account(70)

val t = startThread(a1, a2, 10)
val s = startThread(a2, a1, 40)
t.join()
s.join()