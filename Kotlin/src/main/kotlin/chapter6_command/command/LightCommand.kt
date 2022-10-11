package chapter6_command.command

import chapter6_command.iot.Light

class LightCommand(
    private val light: Light
): Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}
