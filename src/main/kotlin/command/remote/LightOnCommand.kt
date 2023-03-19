package command.remote

class LightOnCommand(
    private val light: Light
) : Command {
    override fun execute() {
        light.on()
    }
}