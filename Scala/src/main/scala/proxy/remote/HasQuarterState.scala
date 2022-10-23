package proxy.remote


@SerialVersionUID(2L)
class HasQuarterState(@transient gumballMachine: GumballMachine) extends State {

  override def insertQuarter(): Unit = println("(N/A) 동전은 한 개만 넣어주세요")

  override def ejectQuarter(): Unit = {
    println("동전이 반환됩니다")
    gumballMachine.setState(gumballMachine.noQuarterState)
  }

  override def turnCrank(): Unit = {
    println("손잡이를 돌리셨습니다")
    gumballMachine.setState(gumballMachine.soldState)
  }

  override def dispense(): Unit = println("(N/A) 알맹이를 내보낼 수 없습니다")
}
