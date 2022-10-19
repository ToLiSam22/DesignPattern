package command

object RemoteControlTest extends App{

  val remote = new RemoteControl()
  val light1 = new Light("kitchen")
  val light2 = new Light("living room")
  remote.setCommand(0, new LightCommand(light1))
  remote.setCommand(1, new LightCommand(light2))

  println(remote.toString)

  remote.onButtonWasPushed(0)
  remote.offButtonWasPushed(0)
  remote.offButtonWasPushed(1)
  remote.onButtonWasPushed(1)
  remote.offButtonWasPushed(1)

  println("UNDO START")

  for (_ <- 1 to 7){
    remote.undo()
  }
}
