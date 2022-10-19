package factory

import factory.PizzaType.PizzaType
import factory.ingredient.PizzaIngredientFactory
import factory.pizza.Pizza

trait PizzaStore {

  val ingredientFactory: PizzaIngredientFactory

  def orderPizza(pizzaType: PizzaType): Pizza = {
    val pizza = createPizza(pizzaType)
    pizza.prepare()
    pizza.bake()
    pizza.cut()
    pizza.box()
    pizza
  }

  def createPizza(pizzaType: PizzaType): Pizza

}
