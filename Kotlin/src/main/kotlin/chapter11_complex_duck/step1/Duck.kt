package chapter11_complex_duck.step1

// #3: 꽥꽥할 수 있는 것들에 대한 인터페이스를 만들고
interface Quackable {
    fun quack()
}

// #4: 이를 구현한 다양한 클래스들을 정의해보았습니다. 살펴보면, 청둥오리
class MallardDuck: Quackable {
    override fun quack() {
        println("꽥꽥")
    }
}

// #5: 암오리
class RedheadDuck: Quackable {
    override fun quack() {
        println("꽥꽥")
    }
}

// #6: 오리소리내는피리
class DuckCall: Quackable {
    override fun quack() {
        println("꽉꽉")
    }
}

// #7: 러버덕이 있습니다
class RubberDuck: Quackable {
    override fun quack() {
        println("삑삑")
    }

}
