package Week4

trait Subscriber {
  def handler(pub: Publisher)
}