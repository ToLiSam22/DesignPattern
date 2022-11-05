package chapter11_complex_duck.step5

// #29: 오리의 수가 많아진다면, 따로따로 관리하기 힘들 것 같네요!
// #30: 컴포지트패턴과 반복자패턴을 이용해 객체들을 무리로 관리해볼까요?
object DuckSimulator {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("[DuckSimulator] 시작")
        val duckFactory = CountingDuckFactory()

        val mallardDuck = duckFactory.createMallardDuck()
        val redheadDuck = duckFactory.createRedheadDuck()
        val duckCall = duckFactory.createDuckCall()
        val rubberDuck = duckFactory.createRubberDuck()
        val gooseDuck = GooseAdapter(Goose())

        println("오리 시뮬레이션 게임 + 거위어댑터 + 데코레이터패턴 + 팩토리패턴 + 컴포지트패턴")

        // #36: 자, 이제, 전체 오리무리도 만들어 무리 내에 꽥꽥대는 모든 객체들을 추가합니다
        val flockOfDucks = Flock()
        flockOfDucks.add(redheadDuck)
        flockOfDucks.add(duckCall)
        flockOfDucks.add(rubberDuck)
        flockOfDucks.add(gooseDuck)

        // #37: 청둥오리무리도 만들었어요
        val flockOfMallards = Flock()
        val mallardOne = duckFactory.createMallardDuck()
        val mallardTwo = duckFactory.createMallardDuck()
        val mallardThree = duckFactory.createMallardDuck()
        val mallardFour = duckFactory.createMallardDuck()

        flockOfMallards.add(mallardOne)
        flockOfMallards.add(mallardTwo)
        flockOfMallards.add(mallardThree)
        flockOfMallards.add(mallardFour)

        println("오리시뮬레이션게임: 전체 무리")
        // #38: 아까 만들어뒀던 전체 무리에 청둥오리 무리도 끼워줍니다
        flockOfDucks.add(flockOfMallards)

        // #39: 그럼 이제 전체 무리가 울면 총 7마리가 울어요
        simulate(flockOfDucks)
        println("오리가 소리 낸 횟수: ${QuackCounter.numberOfQuack}")
    }

    private fun simulate(duck: Quackable) {
        duck.quack()
    }
}