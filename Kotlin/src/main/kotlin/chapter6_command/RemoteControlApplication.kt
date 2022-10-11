package chapter6_command

import chapter6_command.command.CeilingFanCommand
import chapter6_command.command.CommandSet
import chapter6_command.command.LightCommand
import chapter6_command.iot.CeilingFan
import chapter6_command.iot.Light

object RemoteControlApplication {
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val remote = RemoteControl()

        val lightCommands = CommandSet(
            command = LightCommand(
                light = Light()
            )
        )

        val ceilingFanCommands = CommandSet(
            CeilingFanCommand(
                ceilingFan = CeilingFan(
                    location = "거실",
                    speed = CeilingFan.CeilingFanSpeed.OFF
                )
            )
        )

        remote.setCommand(0, lightCommands.onCommand, lightCommands.offCommand)
        remote.setCommand(1, ceilingFanCommands.onCommand, ceilingFanCommands.offCommand)

        remote.onButtonWasPushed(0)
        remote.offButtonWasPushed(0)

        remote.onButtonWasPushed(1)
        remote.onButtonWasPushed(1)

        remote.undoButtonWasPushed()
        remote.undoButtonWasPushed()
        remote.undoButtonWasPushed()
        remote.undoButtonWasPushed()
    }
}