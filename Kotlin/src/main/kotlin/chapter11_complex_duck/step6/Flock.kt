package chapter11_complex_duck.step6

// #63: 같은 맥락으로 Flock도 registerObserver()를 override 해주어야합니다
class Flock: QuackObservable(name = "무리") {
    val quackers: MutableList<QuackCounter> = mutableListOf()
    fun add(quacker: QuackCounter) {
        quackers.add(quacker)
    }

    override fun quack() {
        val iterator = quackers.iterator()
        while (iterator.hasNext()) {
            val quacker = iterator.next()
            quacker.quack()
        }
    }

    // #64: observer를 등록할때, 하위 객체들의 observer도 등록해줍니다
    override fun registerObserver(observer: Observer) {
        val iterator = quackers.iterator()
        while (iterator.hasNext()) {
            val quacker = iterator.next()
            quacker.registerObserver(observer)
        }
    }
}
