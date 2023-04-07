package command.undo

class LightOnCommand(
    private val light: Light
) : Command {
    private var prevLevel: Int = 0

    override fun execute() {
        prevLevel = light.level
        light.on()
    }

    override fun undo() {
        light.dim(prevLevel)
    }
}