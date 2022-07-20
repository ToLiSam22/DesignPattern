package strategy

object QuackBehavior {
  def quack(): Unit = println("꽥꽥!")
  def squeak(): Unit = println("삑삑~")
  def muteQuack(): Unit = println("silence")
}
