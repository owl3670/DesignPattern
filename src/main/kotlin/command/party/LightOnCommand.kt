package command.party

class LightOnCommand(
    private val light: Light
) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}