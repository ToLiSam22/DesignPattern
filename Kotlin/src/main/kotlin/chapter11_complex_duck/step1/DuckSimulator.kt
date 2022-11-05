package chapter11_complex_duck.step1

// #1: 오리 시뮬레이션 게임을 처음부터 다시 만들면서 몇가지 기능을 추가해봅시다
// #2: 첫번째 시뮬레이션은 여러 오리들을 생성해 제대로 꽥꽥하는지만 확인해보는 테스트입니다
object DuckSimulator {

    // #8: 실행해보며 제대로 꽥꽥대는지 확인해봅시다. 굳!
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("[DuckSimulator] 시작")
        val mallardDuck: MallardDuck = MallardDuck()
        val redheadDuck: RedheadDuck = RedheadDuck()
        val duckCall: DuckCall = DuckCall()
        val rubberDuck: RubberDuck = RubberDuck()

        println("오리 시뮬레이션 게임")
        simulate(mallardDuck)
        simulate(redheadDuck)
        simulate(duckCall)
        simulate(rubberDuck)
    }

    private fun simulate(duck: Quackable) {
        duck.quack()
    }
}