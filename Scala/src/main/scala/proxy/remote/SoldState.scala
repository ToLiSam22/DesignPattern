package proxy.remote

@SerialVersionUID(2L)
class SoldState(@transient gumballMachine: GumballMachine) extends State {
  override def insertQuarter(): Unit = println("(N/A) 알맹이를 내보내고 있습니다")

  override def ejectQuarter(): Unit = println("(N/A) 이미 알맹이를 뽑으셨습니다")

  override def turnCrank(): Unit = println("(N/A) 손잡이는 한 번만 돌려주세요")

  override def dispense(): Unit = {
    gumballMachine.releaseBall()
    val count = gumballMachine.getCount
    if (count > 0) {
      gumballMachine.setState(gumballMachine.noQuarterState)
    } else {
      println("Oops, out of gumballs!")
      gumballMachine.setState(gumballMachine.soldOutState)
    }
  }
}
