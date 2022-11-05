package chapter11_complex_duck.step5

// DuckFactory를 이용해 객체를 생성함으로써 QuackCounter를 잘못 사용하는 실수를 방지할 수 있습니다
interface DuckFactory {
    fun createMallardDuck(): Quackable
    fun createRedheadDuck(): Quackable
    fun createDuckCall(): Quackable
    fun createRubberDuck(): Quackable
}

class CountingDuckFactory: DuckFactory {
    override fun createMallardDuck(): Quackable {
        return QuackCounter(MallardDuck())
    }

    override fun createRedheadDuck(): Quackable {
        return QuackCounter(RedheadDuck())
    }

    override fun createDuckCall(): Quackable {
        return QuackCounter(DuckCall())
    }

    override fun createRubberDuck(): Quackable {
        return QuackCounter(RubberDuck())
    }

}