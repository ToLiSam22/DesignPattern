package chapter5_command

import chapter5_command.command.CeilingFanCommand
import chapter5_command.command.CommandSet
import chapter5_command.command.LightCommand
import chapter5_command.iot.CeilingFan
import chapter5_command.iot.Light

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