package chapter4_factory.simple_factory

class PizzaStore(
    private val factory: SimplePizzaFactory
) {
    fun orderPizza(type: String): Pizza {
        val pizza = factory.createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}