package command.undo

class LightOffCommand(
    private val light: Light
) : Command {
    private var prevLevel: Int = 0

    override fun execute() {
        prevLevel = light.level
        light.off()
    }

    override fun undo() {
        light.dim(prevLevel)
    }
}