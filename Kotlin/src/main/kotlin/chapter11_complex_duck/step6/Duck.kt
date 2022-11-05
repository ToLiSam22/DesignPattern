package chapter11_complex_duck.step6

// #45: 이제 꽥꽥대는 객체를 관측하는 대상으로 만들어볼까요?
// #46: 우리는 관측할 수 있는 대상이라면 아래와 같은 메서드를 구현해야한다고 인터페이스를 짰습니다
interface Observable {
    // #47: 관측대상이라면 이를 관측할 observer를 등록하는 메서드와
    fun registerObserver(observer: Observer)
    // #48: 오리가 울때 관측자에게 알람을 주는 메서드가 필요하죠
    fun notifyObservers()
}

// #47: 그럼 이제 관측할 수 있는 추상 오리 클래스를 정의해볼까요?
// #48: 꽥꽥학자가 어떤 오리인지 식별할 수 있도록 name을 넣어주었고,
abstract class QuackObservable(
    val name: String
): Observable {
    // #49: 본 객체를 관찰하는 observer 변수를 가지고 있다.
    private val observers: MutableList<Observer> = mutableListOf()

    // #50: 어떻게 울지는 꽥꽥대는 물체에 따라 다르기때문에 추상적으로만 정의해두고
    abstract fun quack()

    // #51: observer를 등록하고
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    // #52: observer를 trigger할 notifyObservers 메서드를 구현했습니다.
    override fun notifyObservers() {
        // #53: 가진 모든 observer들을 트리거합니다.
        val iterator = observers.iterator()
        while (iterator.hasNext()) {
            val observer = iterator.next()
            // #54: 우리의 observer, 꽥꽥학자는 update호출되면 '꽥꽥학자: XXXX가 방금 소리냈다.'를 출력합니다.
            observer.update(this)
        }
    }
}

// #55: QuackObservable을 상속받은 구체 클래스를 하나 예로 살펴볼까요?
// #56: 청둥오리는 청둥오리라는 이름을 가지고 생성되며
class MallardDuck: QuackObservable(name = "청둥오리") {
    // #56: 꽥꽥 소리를 낼 때 관측자를 깨우도록 구현되어있습니다.
    override fun quack() {
        println("꽥꽥")
        notifyObservers()
    }

    // #57: 나머지 관측자를 등록하거나 notify하는 메서드는 부모클래스에서의 메서드를 그대로 상속받아 사용하죠
}

class RedheadDuck: QuackObservable(name = "암오리")  {
    override fun quack() {
        println("꽥꽥")
        notifyObservers()
    }
}

class DuckCall: QuackObservable(name = "오리소리피리")  {
    override fun quack() {
        println("꽉꽉")
        notifyObservers()
    }
}

class RubberDuck: QuackObservable(name = "러버덕")  {
    override fun quack() {
        println("삑삑")
        notifyObservers()
    }
}
