package factory.ingredient

trait Cheese {
  val name: String = this.getClass.getSimpleName
}

class ReggianoCheese extends Cheese
class MozzarellaCheese extends Cheese
