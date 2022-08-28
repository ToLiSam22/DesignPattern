package chapter4_factory.factory_method

object PizzaTestApplication {
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val nyStore = NYPizzaStore()
        val chicagoSTore = ChicagoPizzaStore()

        val edanPizza = nyStore.orderPizza("cheese")
        println("에단이 주문한 ${edanPizza.name} 완성!\n")

        val zoelPizza = chicagoSTore.orderPizza("cheese")
        println("조엘이 주문한 ${zoelPizza.name} 완성!\n")
    }
}
