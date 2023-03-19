package command.remote

class GarageDoorDownCommand(
    private val garageDoor: GarageDoor
) : Command {
    override fun execute() {
        garageDoor.down()
    }
}