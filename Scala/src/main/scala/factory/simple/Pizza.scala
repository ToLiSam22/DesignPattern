package factory.simple

trait Pizza {
  val name: String = this.getClass.getSimpleName

  def prepare(): Unit = {
    println("준비 중...")
  }

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

class NyVeggiePizza extends Pizza

class NyCheesePizza extends Pizza

class NyClamPizza extends Pizza

class NyPepperoniPizza extends Pizza

class ChicagoVeggiePizza extends Pizza

class ChicagoCheesePizza extends Pizza

class ChicagoClamPizza extends Pizza

class ChicagoPepperoniPizza extends Pizza
