package command.remote

class LivingroomLightOnCommand(
    private val light: Light
) : Command {
    override fun execute() {
        light.on()
    }
}