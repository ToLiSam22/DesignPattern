package command

class LightCommand(light: Light) extends Command {
  override def execute(): Unit = light.on()

  override def stop(): Unit = light.off()

  override def toString: String = s"${light.location} ${super.toString}"
}
