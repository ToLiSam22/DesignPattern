package chapter8_template

abstract class CaffeinBeverage {
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    abstract fun brew()
    abstract fun addCondiments()

    fun boilWater() {
        println("물을 끓여요")
    }

    fun pourInCup() {
        println("컵에 부어요")
    }
}

class Coffee: CaffeinBeverage() {
    override fun brew() {
        println("필터로 커피를 우려내는 중")
    }

    override fun addCondiments() {
        println("설탕과 우유를 추가하는 중")
    }
}

class Tea: CaffeinBeverage() {
    override fun brew() {
        println("찻잎을 우려내는 중")
    }

    override fun addCondiments() {
        println("레몬을 추가하는 중")
    }
}
