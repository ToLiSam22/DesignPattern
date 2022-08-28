package decorator

object StarbuzzCoffee extends App {

  val beverage = new Espresso()
  println(s"${beverage.description} $$${beverage.cost}")

  val beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())))
  println(s"${beverage2.description} $$${beverage2.cost}")

  val beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())))
  println(s"${beverage3.description} $$${beverage3.cost}")
}
