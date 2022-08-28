package factory.ingredient

trait Clams {
  val name: String = this.getClass.getSimpleName
}

class FreshClams extends Clams
class FrozenClams extends Clams
