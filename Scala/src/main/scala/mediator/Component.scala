package mediator

trait Component {
  def setMediator(mediator: Mediator): Unit
  def getName: String
}
