package chapter7_adapter

// Turkey Adapter는 Duck 인터페이스를 구현할 예정이다
interface Duck {
    fun quack()
    fun fly()
}

class MallardDuck: Duck {
    override fun quack() {
        println("오리가 꽥")
    }

    override fun fly() {
        println("오리가 날고있어요!")
    }
}