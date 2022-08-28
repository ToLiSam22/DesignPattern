package chapter4_factory.factory_method

abstract class PizzaStore {
    abstract fun createPizza(type: String): Pizza
    fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }
}

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): NYStyleCheesePizza {
        return when(type) {
            "cheese" -> NYStyleCheesePizza()
            else -> throw IllegalStateException()
        }
    }
}

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): ChicagoStyleCheesePizza {
        return when(type) {
            "cheese" -> ChicagoStyleCheesePizza()
            else -> throw IllegalStateException()
        }
    }
}
