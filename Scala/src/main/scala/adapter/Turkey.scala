package adapter

trait Turkey {
  def gobble()
  def fly()
}

class WildTurkey extends Turkey {
  override def gobble(): Unit = println("골골")

  override def fly(): Unit = println("짧은 거리를 날고 있어요!")
}
