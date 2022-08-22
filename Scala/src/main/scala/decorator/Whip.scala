package decorator

class Whip(val beverage: Beverage) extends CondimentDecorator {
  override val description: String = beverage.description + ", 휘핑크림"

  override def cost: Double = beverage.cost + 0.10
}
