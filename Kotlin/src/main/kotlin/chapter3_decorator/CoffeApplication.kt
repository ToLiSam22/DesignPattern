package chapter3_decorator

object CoffeeApplication {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        var beverage1: Beverage = Espresso()
        println("[CoffeeApplication] [${beverage1.description}]의 가격은 ${beverage1.cost()}$ 입니다")

        var beverage2: Beverage = DarkRoast()
        beverage2 = Mocha(beverage = beverage2)
        beverage2 = Mocha(beverage = beverage2)
        beverage2 = Whip(beverage = beverage2)
        println("[CoffeeApplication] [${beverage2.description}]의 가격은 ${beverage2.cost()}$ 입니다")

        var beverage3: Beverage = Espresso()
        beverage3 = Soy(beverage = beverage3)
        beverage3 = Mocha(beverage = beverage3)
        beverage3 = Whip(beverage = beverage3)
        println("[CoffeeApplication] [${beverage3.description}]의 가격은 ${beverage3.cost()}$ 입니다")

        beverage3.size = SIZE.VENTI
        println("[CoffeeApplication] [ ${beverage3.size} - ${beverage3.description}]의 가격은 ${beverage3.cost()}$ 입니다")
    }
}