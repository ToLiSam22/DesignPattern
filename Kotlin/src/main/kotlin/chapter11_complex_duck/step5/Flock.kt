package chapter11_complex_duck.step5

// #31: 컴포지트 패턴이란 개별객체를 모은 콜렉션을 개별객체와 같은 인터페이스를 사용해 구현함으로써 개별객체들을 좀더 쉽게 다룰 수 있는 패턴이었습니다
// #32: 우리도 꽥꽥대는 객체들의 모임또한 Quackable 인터페이스를 따르게 하죠!
class Flock: Quackable {
    // #33: 꽥꽥대는 객체들을 리스트로 저장할 quacker란 리스트 변수를 선언합니다
    val quackers: MutableList<Quackable> = mutableListOf()

    // #34: add라는 method를 통해서 요 무리(Flock)에 꽥꽥대는 객체를 추가할 수 있죠
    fun add(quacker: Quackable) {
        quackers.add(quacker)
    }

    // #35: 무리를 꽥꽥대게 한다면, 무리 내에 모든 오리들이 한번씩 꽥꽥 소리를 냅니다
    override fun quack() {
        println("무리가 울어요")
        val iterator = quackers.iterator()
        while (iterator.hasNext()) {
            val quacker = iterator.next()
            quacker.quack()
        }
    }
}