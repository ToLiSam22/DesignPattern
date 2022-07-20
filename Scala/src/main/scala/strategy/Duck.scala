package strategy

trait Duck {

  val flyBehavior: () => Unit
  val quackBehavior: () => Unit

  def display(): Unit

  def swim(): Unit = println("물에 둥둥")

  def performFly(f: () => Unit = flyBehavior): Unit = f()

  def performQuack(f: () => Unit = quackBehavior): Unit = f()

}


class MallardDuck extends Duck {
  override val flyBehavior: () => Unit = FlyBehavior.flyWithWings
  override val quackBehavior: () => Unit = QuackBehavior.quack

  override def display(): Unit = println("MallardDuck")
}


class RedHeadDuck extends Duck {
  override val flyBehavior: () => Unit = FlyBehavior.flyWithWings
  override val quackBehavior: () => Unit = QuackBehavior.squeak

  override def display(): Unit = println("RedHeadDuck")
}

class RubberDuck extends Duck {
  override val flyBehavior: () => Unit = FlyBehavior.flyNoWay
  override val quackBehavior: () => Unit = QuackBehavior.muteQuack

  override def display(): Unit = println("RubberDuck")
}
