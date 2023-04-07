package command.undo

class DimmerLightOnCommand(
    private val light: Light
) : Command {
    private var prevLevel: Int = 0

    override fun execute() {
        prevLevel = light.level
        light.dim(75)
    }

    override fun undo() {
        light.dim(prevLevel)
    }
}