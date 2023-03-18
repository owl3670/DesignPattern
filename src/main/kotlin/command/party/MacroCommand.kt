package command.party

class MacroCommand(
    private val commands: Array<Command>
) : Command {
    override fun execute() {
        for (command in commands) {
            command.execute()
        }
    }

    override fun undo() {
        for (command in commands) {
            command.undo()
        }
    }
}