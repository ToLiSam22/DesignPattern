package chapter1

class ModelDuck() : Duck() {
    override var flyBehavior: FlyBehavior = FlyNoWay()
    override var quackBehavior: QuackBehavior = Quack()

    override fun display() {
        println("저는 모형오리입니다")
    }
}