package factory.simple

import factory.PizzaType
import factory.PizzaType.PizzaType

trait SimplePizzaFactory {

  def createPizza(pizzaType: PizzaType): Pizza

}

class NyPizzaFactory extends SimplePizzaFactory {
  override def createPizza(pizzaType: PizzaType): Pizza = pizzaType match {
    case PizzaType.CHEESE => new NyCheesePizza()
    case PizzaType.PEPPERONI => new NyPepperoniPizza()
    case PizzaType.CLAM => new NyClamPizza()
    case PizzaType.VEGGIE => new NyVeggiePizza()
  }
}

class ChicagoPizzaFactory extends SimplePizzaFactory {
  override def createPizza(pizzaType: PizzaType): Pizza = pizzaType match {
    case PizzaType.CHEESE => new ChicagoCheesePizza()
    case PizzaType.PEPPERONI => new ChicagoPepperoniPizza()
    case PizzaType.CLAM => new ChicagoClamPizza()
    case PizzaType.VEGGIE => new ChicagoVeggiePizza()
  }
}
