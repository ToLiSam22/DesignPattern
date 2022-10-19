package command

class NoCommand extends Command {
  override def execute(): Unit = {}

  override def stop(): Unit = {}

}
