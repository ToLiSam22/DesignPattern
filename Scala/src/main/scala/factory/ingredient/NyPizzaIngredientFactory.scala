package factory.ingredient

class NyPizzaIngredientFactory extends PizzaIngredientFactory {
  override val style: String = "NY"

  def createDough(): Dough = new ThinCrustDough

  def createSauce(): Sauce = new MarinaraSauce

  def createCheese(): Cheese = new ReggianoCheese

  def createVeggies(): List[Veggies] = List(new Garlic, new Onion, new Mushroom, new RedPepper)

  def createPepperoni(): Pepperoni = new SlicedPepperoni

  def createClam(): Clams = new FreshClams
}
