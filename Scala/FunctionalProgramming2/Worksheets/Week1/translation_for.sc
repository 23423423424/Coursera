package Week1

object translation_for {
  val x = List((1, 2), (3, 4))
  val n = 3

  def isOdd(n: Int): Boolean =
    if (n % 2 == 0) true
    else false

  for {
    i <- 1 until n
    j <- 1 until i
    if isOdd(i + j)
  } yield (i, j)

  (1 until n) flatMap (i =>
    (1 until i).withFilter(j => isOdd(i + j))
      .map(j => (i, j)))

}