package chapter11_complex_duck.step5

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
