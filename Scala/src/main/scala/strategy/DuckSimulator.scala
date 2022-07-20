package strategy


object DuckSimulator extends App {
  val mallardDuck = new MallardDuck()
  mallardDuck.display()
  mallardDuck.performFly()
  mallardDuck.performQuack()

  val redHeadDuck = new RedHeadDuck()
  redHeadDuck.display()
  redHeadDuck.performFly()
  redHeadDuck.performQuack()

  val rubberDuck = new RubberDuck()
  rubberDuck.display()
  rubberDuck.performFly()
  rubberDuck.performQuack()
  rubberDuck.performFly(FlyBehavior.flyWithWings)
  rubberDuck.performQuack(QuackBehavior.quack)
  rubberDuck.performQuack(QuackBehavior.squeak)
}
