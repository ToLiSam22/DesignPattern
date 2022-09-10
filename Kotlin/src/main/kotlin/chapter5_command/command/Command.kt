package chapter5_command.command

class CommandSet(
    private val command: Command
) {
    val onCommand = OnCommand(command = command)
    val offCommand = OffCommand(command = command)

    class OnCommand(
        private val command: Command
    ) : Command {
        override fun execute() {
            command.execute()
        }

        override fun undo() {
            command.undo()
        }
    }

    class OffCommand(
        private val command: Command
    ) : Command {
        override fun execute() {
            command.undo()
        }

        override fun undo() {
            command.execute()
        }
    }
}

interface Command {
    fun execute()
    fun undo()
}
