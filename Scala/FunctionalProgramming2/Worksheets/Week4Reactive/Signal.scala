package Week4Reactive

class Signal[T](expr: => T) {
  import Signal._
  private var myExpr: () => T = _
  private var myValue: T = _
  private var observers: Set[Signal[_]] = Set()
  update(expr)
  protected def update(expr: => T): Unit = {
    myExpr = () => expr
    computeValue()
  }
  protected def computeValue(): Unit = {
    val newValue = caller.withValue(this)(myExpr())
    /**
     * +
     * if (myValue != newValue){
     * myValue = newValue
     * va1 obs = observers
     * observers = Set()
     * obs.foreach(_.computeValue())
     * }
     */
  }
  def apply(): T = {
    observers += caller.value
    assert(!caller.value.observers.contains(this), "cyclic signal definition")
    myValue
  }
}
object NoSignal extends Signal[Nothing](???) {
  override def computeValue() = ()
}
object Signal {
  private val caller = new StackableVariable[Signal[_]](NoSignal)
  //private val caller = new DynamicVariable[Signal[_]](NoSignal)
  // gives the thread local state
  def apply[T](expr: => T) = new Signal(expr)
}