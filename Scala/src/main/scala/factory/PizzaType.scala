package factory

object PizzaType extends Enumeration {
  type PizzaType = Value
  val CHEESE = Value("cheese")
  val PEPPERONI = Value("pepperoni")
  val CLAM = Value("clam")
  val VEGGIE = Value("veggie")
}
