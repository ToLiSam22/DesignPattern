package templatemethod

class Coffee extends CaffeineBeverage {

  override def brew(): Unit = println("필터로 커피를 우려내는 중")

  override def addCondiments(): Unit = println("설탕과 우유를 추가하는 중")

  override def customerWantsCondiments(): Boolean = {
    println("커피에 우유와 설탕을 넣을까요? (y/n)? ")
    val answer = scala.io.StdIn.readLine()
    if (answer == "y" || answer == "yes") {
      true
    } else {
      false
    }
  }
}
