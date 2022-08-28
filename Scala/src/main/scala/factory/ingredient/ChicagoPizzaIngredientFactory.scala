package factory.ingredient

class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {
  override val style: String = "Chicago"

  def createDough(): Dough = new ThickCrustDough

  def createSauce(): Sauce = new PlumTomatoSauce

  def createCheese(): Cheese = new MozzarellaCheese

  def createVeggies(): List[Veggies] = List(new Spinach, new BlackOlives, new EggPlant)

  def createPepperoni(): Pepperoni = new SlicedPepperoni

  def createClam(): Clams = new FrozenClams
}
