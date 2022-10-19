package factory.simple

import factory.PizzaType.PizzaType

abstract class SimplePizzaStore(factory: SimplePizzaFactory) {

  def orderPizza(pizzaType: PizzaType): Pizza = {
    val pizza = factory.createPizza(pizzaType)
    pizza.prepare()
    pizza.bake()
    pizza.cut()
    pizza.box()
    pizza
  }
}

class NyPizzaStore extends SimplePizzaStore(new NyPizzaFactory)

class ChicagoPizzaStore extends SimplePizzaStore(new ChicagoPizzaFactory)
