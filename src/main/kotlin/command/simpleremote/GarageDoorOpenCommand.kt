package command.simpleremote

class GarageDoorOpenCommand(
    private val garageDoor: GarageDoor
) : Command {
    override fun execute() {
        garageDoor.up()
    }
}