package factory.ingredient

trait Dough {
  val name: String = this.getClass.getSimpleName
}

class ThinCrustDough extends Dough
class ThickCrustDough extends Dough
