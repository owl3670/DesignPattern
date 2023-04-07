package command.undo

class DimmerLightOffCommand(
    private val light: Light
) : Command {
    private var prevLevel: Int = 0

    init {
        prevLevel = 100
    }

    override fun execute() {
        prevLevel = light.level
        light.off()
    }

    override fun undo() {
        light.dim(prevLevel)
    }
}
