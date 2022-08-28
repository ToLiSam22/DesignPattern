package chapter4_factory.simple_factory

abstract class Pizza {
    abstract val description: String
    fun prepare() {
        println("$description 준비하기")
    }
    fun bake() {
        println("$description 굽기")
    }
    fun cut() {
        println("$description 자르기")
    }
    fun box() {
        println("$description 담기")
    }
}

class CheesePizza: Pizza() {
    override val description = "치즈피자"
}

class PepperoniPizza: Pizza() {
    override val description = "페퍼로니피자"
}

class ClamPizza: Pizza() {
    override val description = "클랩피자"
}

class VeggiePizza: Pizza() {
    override val description = "채소피자"
}
