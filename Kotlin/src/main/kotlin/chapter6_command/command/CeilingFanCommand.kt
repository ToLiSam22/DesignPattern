package chapter6_command.command

import chapter6_command.iot.CeilingFan

class CeilingFanCommand(
    private val ceilingFan: CeilingFan
): Command {
    override fun execute() {
        this.ceilingFan.speedUp()
    }

    override fun undo() {
        this.ceilingFan.speedDown()
    }
}
