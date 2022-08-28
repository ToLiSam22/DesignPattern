package factory.pizza

import factory.ingredient.PizzaIngredientFactory

class ClamPizza(val ingredientFactory: PizzaIngredientFactory) extends Pizza {

  override def prepare(): Unit = {
    println(s"준비 중: $getName")
    val dough = ingredientFactory.createDough()
    println(s"dough: ${dough.name}")
    val sauce = ingredientFactory.createSauce()
    println(s"sauce: ${sauce.name}")
    val cheese = ingredientFactory.createCheese()
    println(s"cheese: ${cheese.name}")
    val calm = ingredientFactory.createClam()
    println(s"calm: ${calm.name}")
  }
}
