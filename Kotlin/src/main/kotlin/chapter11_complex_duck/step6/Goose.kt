package chapter11_complex_duck.step6

class Goose {
    fun honk() {
        println("끽끽")
    }
}

class GooseAdapter(
    val goose: Goose
): QuackObservable(name = "거위") {
    override fun quack() {
        goose.honk()
    }
}
