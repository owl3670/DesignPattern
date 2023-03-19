package command.remote

class GarageDoorUpCommand(
    private val garageDoor: GarageDoor
) : Command {
    override fun execute() {
        garageDoor.up()
    }
}