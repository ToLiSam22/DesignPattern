package chapter11_complex_duck.step5

// 꽥꽥 소리를 몇번 내었는지 세고 싶은 니즈가 생겼다고 해봅시다
// 즉, Quackable에 꽥꽥 소리를 몇번 내었는지 세는 기능을 추가해야합니다
class QuackCounter(
    val duck: Quackable
): Quackable {
    override fun quack() {
        duck.quack()
        numberOfQuack += 1 // 새로운 기능 추가!
    }

    companion object {
        var numberOfQuack = 0
    }
}
