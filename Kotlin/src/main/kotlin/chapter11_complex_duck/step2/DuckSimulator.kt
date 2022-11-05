package chapter11_complex_duck.step2

object DuckSimulator {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("[DuckSimulator] 시작")
        val mallardDuck: MallardDuck = MallardDuck()
        val redheadDuck: RedheadDuck = RedheadDuck()
        val duckCall: DuckCall = DuckCall()
        val rubberDuck: RubberDuck = RubberDuck()

        // #13: gooseAdapter로 거위도 꽥꽥댈 수 있도록(Quackable) 변경했으니,
        val gooseDuck: GooseAdapter = GooseAdapter(Goose())

        println("오리 시뮬레이션 게임 + 거위어댑터")
        simulate(mallardDuck)
        simulate(redheadDuck)
        simulate(duckCall)
        simulate(rubberDuck)
        simulate(gooseDuck)
    }

    // #14: 거위도 이 함수를 사용할 수 있다는 장점이 있습니다
    private fun simulate(duck: Quackable) {
        duck.quack()
    }
}