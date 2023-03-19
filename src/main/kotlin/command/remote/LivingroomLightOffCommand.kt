package command.remote

class LivingroomLightOffCommand(
    private val light: Light
) : Command {
    override fun execute() {
        light.off()
    }
}