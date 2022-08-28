package factory.ingredient

trait Veggies {
  val name: String = this.getClass.getSimpleName
}

class Garlic extends Veggies
class Onion extends Veggies
class Mushroom extends Veggies
class RedPepper extends Veggies
class Spinach extends Veggies
class BlackOlives extends Veggies
class EggPlant extends Veggies
