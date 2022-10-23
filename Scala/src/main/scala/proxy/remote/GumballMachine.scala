package proxy.remote

import java.rmi.server._

@SerialVersionUID(2L)
class GumballMachine(location: String, numberGumballs: Int) extends UnicastRemoteObject with GumballMachineRemote {
  val hasQuarterState: State = new HasQuarterState(this)
  val noQuarterState: State = new NoQuarterState(this)
  val soldOutState: State = new SoldOutState(this)
  val soldState: State = new SoldState(this)

  private var state: State = if (numberGumballs > 0) noQuarterState else soldOutState
  private var count: Int = numberGumballs

  override def toString: String = s"\n스칼라로 돌아가는 최신형 뽑기 기계\n남은 개수:$count\n"

  override def getCount: Int = count

  override def getLocation: String = location

  override def getState: State = state

  def setState(state: State): Unit = this.state = state

  def insertQuarter(): Unit = state.insertQuarter()

  def ejectQuarter(): Unit = state.ejectQuarter()

  def turnCrank(): Unit = {
    state.turnCrank()
    state.dispense()
  }

  def releaseBall(): Unit = {
    if (count > 0) {
      println("알맹이를 내보내고 있습니다")
      count -= 1
    }
  }
}