package chapter11_complex_duck.step3

// #15: 이제 꽥꽥 소리를 몇번 내었는지 세고 싶은 니즈가 생겼어요
// #16: 즉, Quackable에, 꽥꽥 소리를 몇번 내었는지 세는 기능을 *추가*해야합니다
// #17: QuackCounter는 감싸고 있는 duck이 꽥꽥할때마다 꽥꽥 소리를 몇번 내었는지 카운팅하는 클래스입니다
class QuackCounter(
    val duck: Quackable
): Quackable {
    // #18: QuackCounter는 꽥꽥 소리가 몇번 등장했는지 세기 위한 정적변수를 가지고 있습니다.
    companion object {
        var numberOfQuack = 0
    }

    override fun quack() {
        duck.quack()
        // #19: 이 변수는 꽥꽥 소리가 날 때마다 1씩 증가합니다
        numberOfQuack += 1
    }
}
