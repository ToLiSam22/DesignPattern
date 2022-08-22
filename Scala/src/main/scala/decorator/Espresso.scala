package decorator

class Espresso extends Beverage {
  override val description: String = "에스프레소"

  override def cost: Double = 1.99
}
