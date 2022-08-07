package chapter1

class MallardDuck : Duck() {
    override var flyBehavior: FlyBehavior = FlyWithWings()
    override var quackBehavior: QuackBehavior = Quack()

    override fun display() {
        println("저는 물오리입니다")
    }
}