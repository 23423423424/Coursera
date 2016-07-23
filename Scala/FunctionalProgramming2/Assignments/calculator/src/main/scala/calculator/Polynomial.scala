package calculator

object Polynomial {
  def computeDelta(a: Signal[Double], b: Signal[Double],
                   c: Signal[Double]): Signal[Double] = {
    Signal((b() * b()) - (4 * a() * c()))
  }

  def computeSolutions(a: Signal[Double], b: Signal[Double],
                       c: Signal[Double], delta: Signal[Double]): Signal[Set[Double]] = {
    Signal {
      val dVal = delta()
      if (dVal < 0) Set()
      else {
        val bVal = b()
        val aVal = a()
        Set(
          (-bVal + Math.sqrt(dVal)) / (2 * aVal),
          (-bVal - Math.sqrt(dVal)) / (2 * aVal))
      }
    }
  }
}
