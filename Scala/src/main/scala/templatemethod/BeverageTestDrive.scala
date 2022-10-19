package templatemethod

object BeverageTestDrive extends App {
  val tea = new Tea()
  val coffee = new Coffee()

  println("홍차 준비 중")
  tea.prepareRecipe()

  println("커피 준비 중")
  coffee.prepareRecipe()

}
