package chapter11_complex_duck.step4

object DuckSimulator {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("[DuckSimulator] 시작")
        val duckFactory = CountingDuckFactory()

        // #27: 이렇게 만든 팩토리에서 객체를 찍어냄으로써 decorator를 잘못 사용할 일이 훨씬 줄어들었죠!
        // #28: 한번 돌려볼까요?
        val mallardDuck = duckFactory.createMallardDuck()
        val redheadDuck = duckFactory.createRedheadDuck()
        val duckCall = duckFactory.createDuckCall()
        val rubberDuck = duckFactory.createRubberDuck()
        val gooseDuck = GooseAdapter(Goose())

        println("오리 시뮬레이션 게임 + 거위어댑터 + 데코레이터패턴 + 팩토리패턴")
        simulate(mallardDuck)
        simulate(redheadDuck)
        simulate(duckCall)
        simulate(rubberDuck)
        simulate(gooseDuck)

        println("오리가 소리 낸 횟수: ${QuackCounter.numberOfQuack}")
    }

    private fun simulate(duck: Quackable) {
        duck.quack()
    }
}