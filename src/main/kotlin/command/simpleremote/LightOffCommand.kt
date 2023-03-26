package command.simpleremote

class LightOffCommand(
    private val light: Light
) : Command {
    override fun execute() {
        light.off()
    }
}