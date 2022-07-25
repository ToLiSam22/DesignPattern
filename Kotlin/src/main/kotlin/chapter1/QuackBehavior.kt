package chapter1

interface QuackBehavior {
    fun quack()
}

class Quack: QuackBehavior {
    override fun quack() {
        println("꽥")
    }
}

class MuteQuack: QuackBehavior {
    override fun quack() {
        println("조용")
    }
}

class Squeak: QuackBehavior {
    override fun quack() {
        println("삑")
    }
}