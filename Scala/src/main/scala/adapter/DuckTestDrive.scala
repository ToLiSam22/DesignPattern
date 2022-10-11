package adapter

import strategy.{Duck, MallardDuck}

object DuckTestDrive extends App {
  val duck = new MallardDuck()
  val turkey = new WildTurkey()
  val turkeyAdapter = new TurkeyAdapter(turkey)

  println("칠면조가 말하길")
  turkey.gobble()
  turkey.fly()

  println("오리가 말하길")
  testDuck(duck)

  println("칠면조 어댑터가 말하길")
  testDuck(turkeyAdapter)

  def testDuck(duck: Duck): Unit = {
    duck.performQuack()
    duck.performFly()
  }

}
