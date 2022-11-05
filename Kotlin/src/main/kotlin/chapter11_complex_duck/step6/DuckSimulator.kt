package chapter11_complex_duck.step6

// #40: 반대로 오리들을 1마리씩 추적하는 기능이 필요해졌다고 해볼까요?
// #41: 옵저버 패턴을 적용할 예정입니다!
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

        val flockOfDucks = Flock()
        flockOfDucks.add(mallardDuck)
        flockOfDucks.add(redheadDuck)
        flockOfDucks.add(duckCall)
        flockOfDucks.add(rubberDuck)

        // #65: 이제 관측자를 만들고 등록하고
        simulate(flockOfDucks)
    }

    private fun simulate(duck: QuackObservable): String {
        val quackologist = Quackologist().run{
            return "hello"
        }
        println("hello")
    }
}

// #67: 지금까지 본 여러 패턴을 합친 형태의 코드는 복합패턴이라고 할 수 없습니다
// #68: 보편적인 문제의 해결법이 아니기 때문이죠. 다만 이런식으로 여러 패턴을 함께 사용할 수 있다는 점을 짚고 넘어가고 싶었습니다.
// #69: 다음으로 볼 MVC(모델-뷰-컨트롤러)는 다양한 디자인 문제를 해결할 수 있으므로 복합패턴이 맞습니다.
// #70: 한번 MVC패턴을 살펴볼까요?