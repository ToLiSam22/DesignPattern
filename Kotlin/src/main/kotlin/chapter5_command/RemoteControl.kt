package chapter5_command

import chapter5_command.command.Command
import chapter5_command.command.NoCommand
import java.util.Stack

class RemoteControl {
    private val onCommands = mutableListOf<Command>()
    private val offCommands = mutableListOf<Command>()
    private var undoCommands = Stack<Command>()

    init {
        val noCommand = NoCommand()
        for (i: Int in 1 .. SLOT_SIZE) {
            onCommands.add(noCommand)
            offCommands.add(noCommand)
        }
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommands.push(onCommands[slot])
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommands.push(offCommands[slot])
    }

    fun undoButtonWasPushed() {
        if (undoCommands.size > 0) {
            val cmd = undoCommands.pop()
            cmd.undo()
        } else {
            println("취소할 명령이 없습니다")
        }
    }

    companion object {
        const val SLOT_SIZE = 7
    }
}
