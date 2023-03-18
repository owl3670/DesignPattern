package command.party

class LivingroomLightOffCommand(
    private val light: Light
) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}