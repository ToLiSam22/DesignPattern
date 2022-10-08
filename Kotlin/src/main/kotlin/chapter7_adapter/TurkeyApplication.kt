package chapter7_adapter

object TurkeyApplication {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val duck = MallardDuck()

        val turkeyAdapter = TurkeyAdapter()
        val wildTurkeyAdapter = WildTurkeyAdapter()
        val turkey = Turkey()

        val duckList = listOf(duck, turkeyAdapter, wildTurkeyAdapter)
        for (d in duckList) {
            d.quak()
            d.fly()
            println()
        }
    }
}