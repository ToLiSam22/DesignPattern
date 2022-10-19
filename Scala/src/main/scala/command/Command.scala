package command

trait Command {

  def execute(): Unit

  def stop(): Unit

  override def toString: String = this.getClass.getSimpleName

}
