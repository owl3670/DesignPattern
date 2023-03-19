package command.remote

class CeilingFanOnCommand(
    private val ceilingFan: CeilingFan
) : Command {
    override fun execute() {
        ceilingFan.high()
    }
}