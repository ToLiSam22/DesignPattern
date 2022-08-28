package factory.simple

import factory.PizzaType

object SimplePizzaTestDrive extends App {
  val nyStore = new NyPizzaStore()
  val chicagoStore = new ChicagoPizzaStore()

  val nyPizza = nyStore.orderPizza(PizzaType.CHEESE)
  println(s"에단이 주문한 ${nyPizza.name}")

  val chicagoPizza = chicagoStore.orderPizza(PizzaType.CHEESE)
  println(s"조엘이 주문한 ${chicagoPizza.name}")
}
