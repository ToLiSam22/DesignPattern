package adapter

import strategy.Duck

class TurkeyAdapter(turkey: Turkey) extends Duck {
  override val flyBehavior: () => Unit = turkey.fly
  override val quackBehavior: () => Unit = turkey.gobble

  override def display(): Unit = println(turkey.getClass.getSimpleName + "-Adapter")
}
