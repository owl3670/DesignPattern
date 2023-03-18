package command.party;

class HottubOffCommand(
	private val hottub: Hottub
) : Command {
	override fun execute() {
		hottub.temperature = 98
		hottub.off()
	}

	override fun undo() {
		hottub.on()
	}
}
