package proxy.remote

@SerialVersionUID(2L)
class NoQuarterState(@transient gumballMachine: GumballMachine) extends State {
  override def insertQuarter(): Unit = {
    println("동전을 넣으셨습니다.")
    gumballMachine.setState(gumballMachine.hasQuarterState)
  }

  override def toString: String = "동전 투입 대기 중"

  override def ejectQuarter(): Unit = println("(N/A) 동전을 넣어주세요")

  override def turnCrank(): Unit = println("(N/A) 동전을 넣어주세요")

  override def dispense(): Unit = println("(N/A) 동전을 넣어주세요")
}
