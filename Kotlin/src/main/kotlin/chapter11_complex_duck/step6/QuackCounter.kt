package chapter11_complex_duck.step6

// #58: 우리는 몇번 꽥꽥댔는지 세는 기능도 포기할 수 없어요
// #59: QuackObservable을 감싸는 QuackCounter도 수정해줍시다
class QuackCounter(
    val duck: QuackObservable
): QuackObservable(name = duck.name) {
    // #60: 관측자를 등록하고자 할 때 duck 객체에다 observer를 등록해야합니다.
    // #61: 요렇게 override 되어있지 않으면 duck이 아니라 quackCounter에 observer가 등록되어 헷갈릴 수 있어요
    override fun registerObserver(observer: Observer) {
        duck.registerObserver(observer)
    }

    // #62: 요거는 똑같습니다. duck.quack()이 이뤄지면 꽥꽥대면서 notifyObserver도 호출되죠
    override fun quack() {
        duck.quack()
        numberOfQuack += 1
    }

    companion object {
        var numberOfQuack = 0
    }
}
