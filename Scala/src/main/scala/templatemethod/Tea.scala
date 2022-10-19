package templatemethod

class Tea extends CaffeineBeverage {
  override def brew(): Unit = println("찻잎을 우려내는 중")

  override def addCondiments(): Unit = println("레몬을 추가하는 중")
}
