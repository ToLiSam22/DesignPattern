package chapter11_complex_duck.step3

class Goose {
    fun honk() {
        println("끽끽")
    }
}

class GooseAdapter(
    val goose: Goose
): Quackable {
    override fun quack() {
        goose.honk()
    }
}
