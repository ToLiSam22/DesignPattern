package chapter6_command.command

class NoCommand: Command {
    override fun execute() {}
    override fun undo() {}
}
