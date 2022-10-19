package factory.pizza

import factory.ingredient.PizzaIngredientFactory

trait Pizza {
  private val name: String = this.getClass.getSimpleName
  val ingredientFactory: PizzaIngredientFactory

  def getName: String = ingredientFactory.style + " " + name

  def prepare(): Unit

  def bake(): Unit = {
    println("175도에서 25분간 굽기")
  }

  def cut(): Unit = {
    println("피자를 사선으로 자르기")
  }

  def box(): Unit = {
    println("상자에 피자 담기")
  }

}
