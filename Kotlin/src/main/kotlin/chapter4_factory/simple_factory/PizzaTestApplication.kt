package chapter4_factory.simple_factory

object PizzaTestApplication {
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val pizzaStore = PizzaStore(SimplePizzaFactory())
        pizzaStore.orderPizza("cheese")
    }
}