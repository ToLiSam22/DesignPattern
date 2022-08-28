package factory

import factory.PizzaType.PizzaType
import factory.ingredient.{ChicagoPizzaIngredientFactory, PizzaIngredientFactory}
import factory.pizza._

class ChicagoPizzaStore extends PizzaStore {
  override val ingredientFactory: PizzaIngredientFactory = new ChicagoPizzaIngredientFactory

  override def createPizza(pizzaType: PizzaType): Pizza = pizzaType match {
    case PizzaType.CHEESE => new CheesePizza(ingredientFactory)
    case PizzaType.CLAM => new ClamPizza(ingredientFactory)
  }
}
