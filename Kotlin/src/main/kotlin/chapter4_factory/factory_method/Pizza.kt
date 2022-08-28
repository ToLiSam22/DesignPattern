package chapter4_factory.factory_method

abstract class Pizza {
    abstract val name: String
    abstract val dough: String
    abstract val sauce: String
    val toppings: MutableList<String> = mutableListOf()

    fun prepare() {
        println("준비 중: $name")
        println("도우를 돌리는 중")
        println("소스를 뿌리는 중")
        println("토핑을 올리는 중")
        for (topping in toppings) {
            println(" $topping")
        }
    }

    fun bake() {
        println("175도에서 25분간 굽기")
    }

    open fun cut() {
        println("피자를 사선으로 자르기")
    }

    fun box() {
        println("상자에 피자 담기")
    }
}

class NYStyleCheesePizza() : Pizza() {
    override val name = "뉴욕 스타일 소스와 치즈 피자"
    override val dough = "씬 크러스트 도우"
    override val sauce = "마리나라 소스"

    init {
        toppings.add("잘게 조각낸 모짜렐라 치즈")
    }
}

class ChicagoStyleCheesePizza() : Pizza() {
    override val name = "시카고 스타일 딥 디쉬 치즈 피자"
    override val dough = "아주 두꺼운 크러스트 도우"
    override val sauce = "플럼토마토 소스"

    init {
        toppings.add("잘게 조각낸 모짜렐라 치즈")
    }

    override fun cut() {
        println("네모난 모양으로 피자 자르기")
    }
}