package chapter11_complex_duck.step6

// DuckFactory를 이용해 객체를 생성함으로써 QuackCounter를 잘못 사용하는 실수를 방지할 수 있습니다
interface DuckFactory {
    fun createMallardDuck(): QuackCounter
    fun createRedheadDuck(): QuackCounter
    fun createDuckCall(): QuackCounter
    fun createRubberDuck(): QuackCounter
}

class CountingDuckFactory: DuckFactory {
    override fun createMallardDuck(): QuackCounter {
        return QuackCounter(MallardDuck())
    }

    override fun createRedheadDuck(): QuackCounter {
        return QuackCounter(RedheadDuck())
    }

    override fun createDuckCall(): QuackCounter {
        return QuackCounter(DuckCall())
    }

    override fun createRubberDuck(): QuackCounter {
        return QuackCounter(RubberDuck())
    }

}