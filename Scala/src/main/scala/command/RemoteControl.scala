package command

import scala.collection.mutable

class RemoteControl {

  val controlSize = 7
  val commands = new Array[Command](controlSize)
  val noCommand = new NoCommand()
  for (i <- 0 until 7) {
    commands(i) = noCommand
  }
  val undoCommands = new mutable.ListBuffer[() => Unit]

  def setCommand(slot: Int, command: Command): Unit = {
    commands(slot) = command
  }

  def onButtonWasPushed(slot: Int): Unit = {
    commands(slot).execute()
    undoCommands.append(commands(slot).stop)
  }

  def offButtonWasPushed(slot: Int): Unit = {
    commands(slot).stop()
    undoCommands.append(commands(slot).execute)
  }

  def undo(): Unit = {
    if (undoCommands.isEmpty) {
      println("No Command to execute undo")
    } else {
      val undoCommand = undoCommands.last
      undoCommands.remove(undoCommands.length - 1)
      undoCommand()
    }
  }

  override def toString: String = {
    commands.zipWithIndex.map(x => {
      s"${x._2} - ${x._1.toString}"
    }).mkString("\n")
  }
}
