package templatemethod

trait CaffeineBeverage {

  def prepareRecipe(): Unit = {
    boilWater()
    brew()
    pourIncCup()
    if (customerWantsCondiments()) addCondiments()
  }

  def brew(): Unit

  def addCondiments(): Unit

  def boilWater(): Unit = println("물 끓이는 중")

  def pourIncCup(): Unit = println("컵에 따르는 ")

  def customerWantsCondiments(): Boolean = true
}
