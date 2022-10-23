package proxy.remote

trait State extends Serializable {
  def insertQuarter(): Unit

  def ejectQuarter(): Unit

  def turnCrank(): Unit

  def dispense(): Unit
}
