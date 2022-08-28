package decorator

class Mocha(val beverage: Beverage) extends CondimentDecorator {
  override val description: String = beverage.description + ", 모카"

  override def cost: Double = beverage.cost + 0.20
}
