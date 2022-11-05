package chapter11_complex_duck.step2

// #9: 이제 시뮬레이션에 거위도 추가되었습니다
class Goose {
    // #10: 거위는 꽥꽥대지 않죠
    fun honk() {
        println("끽끽")
    }
}

// #11: 하지만 거위도 quack()을 통해 소리를 낼 수 있도록, 어댑터를 만들어 적용해주십다
// #12: GooseAdapter는 quack이 호출되면 goose의 honk를 대신 호출해줍니다
class GooseAdapter(
    val goose: Goose
): Quackable {
    override fun quack() {
        goose.honk()
    }
}
