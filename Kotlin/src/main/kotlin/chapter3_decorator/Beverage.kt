package chapter3_decorator

enum class SIZE{
    TALL,
    GRANDE,
    VENTI
}

abstract class Beverage{
    open val description: String = "제목 없음"
    open var size: SIZE = SIZE.TALL
    abstract fun cost(): Double
}

class Espresso: Beverage() {
    override val description = "에스프레소"
    override fun cost(): Double {
        return when (size) {
            SIZE.TALL -> 1.99
            SIZE.GRANDE -> 2.01
            SIZE.VENTI -> 2.20
        }
    }
}

class DarkRoast: Beverage() {
    override val description = "다크로스트"
    override fun cost(): Double {
        return when (size) {
            SIZE.TALL -> 1.0
            SIZE.GRANDE -> 1.2
            SIZE.VENTI -> 1.4
        }
    }
}

class HouseBlend: Beverage() {
    override val description = "하우스블렌드"
    override fun cost(): Double {
        return when (size) {
            SIZE.TALL -> .89
            SIZE.GRANDE -> .99
            SIZE.VENTI -> 1.09
        }
    }
}