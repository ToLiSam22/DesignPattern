package chapter11_complex_duck.step6

// #42: Observer부터 살펴볼까요?
// #43: observer를 trigger시킬 메서드로 update가 있습니다
interface Observer {
    fun update(duck: QuackObservable)
}

// #44: observer 꽥꽥학자는 update로 호출되면 어떤 오리가 소리를 내었는지 출력해줍니다.
class Quackologist: Observer {
    override fun update(duck: QuackObservable) {
        println("꽥꽥학자: " + duck.name + "가 방금 소리냈다.")
    }
}
