package factory.ingredient

trait Pepperoni {
  val name: String = this.getClass.getSimpleName
}

class SlicedPepperoni extends Pepperoni
