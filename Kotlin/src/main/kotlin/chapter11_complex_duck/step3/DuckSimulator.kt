package chapter11_complex_duck.step3

object DuckSimulator {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("[DuckSimulator] 시작")
        // #20: 꽥꽥대는 객체들에게 Counter 기능을 추가합니다. 이는 데코레이터 패턴이죠!
        val mallardDuck = QuackCounter(MallardDuck())
        val redheadDuck = QuackCounter(RedheadDuck())
        val duckCall = QuackCounter(DuckCall())
        val rubberDuck = QuackCounter(RubberDuck())
        val gooseDuck = GooseAdapter(Goose())

        println("오리 시뮬레이션 게임 + 거위어댑터 + 데코레이터패턴")
        simulate(mallardDuck)
        simulate(redheadDuck)
        simulate(duckCall)
        simulate(rubberDuck)
        simulate(gooseDuck)

        // #21: QuackCounter의 정적변수를 통해 오리가 소리 낸 횟수를 확인할 수 있습니다
        println("오리가 소리 낸 횟수: ${QuackCounter.numberOfQuack}")
    }

    private fun simulate(duck: Quackable) {
        duck.quack()
    }
}