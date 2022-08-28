package factory.ingredient

trait Sauce {
  val name: String = this.getClass.getSimpleName
}

class MarinaraSauce extends Sauce
class PlumTomatoSauce extends Sauce
