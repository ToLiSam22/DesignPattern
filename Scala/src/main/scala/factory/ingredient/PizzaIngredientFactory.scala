package factory.ingredient

trait PizzaIngredientFactory {

  val style: String

  def createDough(): Dough

  def createSauce(): Sauce

  def createCheese(): Cheese

  def createVeggies(): List[Veggies]

  def createPepperoni(): Pepperoni

  def createClam(): Clams
}
