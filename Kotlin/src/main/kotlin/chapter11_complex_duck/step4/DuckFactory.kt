package chapter11_complex_duck.step4

// #22: 데코레이터를 쓸 때는 객체를 제대로 포장하지 않으면 원하는 행동을 추가할 수 없습니다
// #23: 실수가 발생할 수 있는 포인트이니 팩토리패턴을 한번 적용해볼까요?
// #24: DuckFactory를 이용해 객체를 생성하는 방법을 관리함으로써, QuackCounter를 잘못 사용하는 실수를 방지할 수 있습니다
// #25: DuckFactory는 청둥오리, 암오리, 오리소리나는피리, 러버덕을 만드는 인터페이스를 정의하고 있고
interface DuckFactory {
    fun createMallardDuck(): Quackable
    fun createRedheadDuck(): Quackable
    fun createDuckCall(): Quackable
    fun createRubberDuck(): Quackable
}

// #26: DuckFactory를 구현한 CountingDuckFactory는 꽥꽥대는 객체들을 QuackCounter로 감싸 생성해 반환하는 책임을 다하고 있습니다
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