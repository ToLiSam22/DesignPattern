package factory

import factory.PizzaType.PizzaType
import factory.ingredient.{NyPizzaIngredientFactory, PizzaIngredientFactory}
import factory.pizza._

class NyPizzaStore extends PizzaStore {
  override val ingredientFactory: PizzaIngredientFactory = new NyPizzaIngredientFactory

  override def createPizza(pizzaType: PizzaType): Pizza = pizzaType match {
    case PizzaType.CHEESE => new CheesePizza(ingredientFactory)
    case PizzaType.CLAM => new ClamPizza(ingredientFactory)
  }
}
