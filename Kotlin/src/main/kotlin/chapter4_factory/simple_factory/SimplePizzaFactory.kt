package chapter4_factory.simple_factory

class SimplePizzaFactory {
    fun createPizza(type: String): Pizza {
        return when(type) {
            "cheese" -> CheesePizza()
            "pepperoni" -> PepperoniPizza()
            "clam" -> ClamPizza()
            "veggie" -> VeggiePizza()
            else -> throw IllegalStateException()
        }
    }
}