package decorator

class Milk(val beverage: Beverage) extends CondimentDecorator {
  override val description: String = beverage.description + ", 우유"

  override def cost: Double = beverage.cost + 0.10
}
