package proxy.remote

@SerialVersionUID(2L)
class SoldOutState(@transient gumballMachine: GumballMachine) extends State {
  override def insertQuarter(): Unit = println("(N/A) 죄송합니다. 매진되었습니다")

  override def ejectQuarter(): Unit = println("(N/A) 동전을 반환할 수 없습니다. 동전을 넣지 않았습니다")

  override def turnCrank(): Unit = println("(N/A) 죄송합니다. 매진되었습니다")

  override def dispense(): Unit = println("(N/A) 알맹이를 내보낼 수 없습니다")
}
