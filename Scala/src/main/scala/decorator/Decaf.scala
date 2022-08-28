package decorator

class Decaf extends Beverage {
  override val description: String = "디카페인"

  override def cost: Double = 1.05
}
