package decorator

class Soy(val beverage: Beverage) extends CondimentDecorator {
  override val description: String = beverage.description + ", 두유"

  override def cost: Double = beverage.cost + 0.15
}
