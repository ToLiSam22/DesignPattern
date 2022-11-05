package chapter11_complex_duck.step4

interface Quackable {
    fun quack()
}

class MallardDuck: Quackable {
    override fun quack() {
        println("꽥꽥")
    }
}

class RedheadDuck: Quackable {
    override fun quack() {
        println("꽥꽥")
    }
}

class DuckCall: Quackable {
    override fun quack() {
        println("꽉꽉")
    }
}

class RubberDuck: Quackable {
    override fun quack() {
        println("삑삑")
    }

}
