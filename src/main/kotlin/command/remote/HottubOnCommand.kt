package command.remote;

class HottubOnCommand(
		private val hottub : Hottub
) : Command {
	override fun execute() {
		hottub.on()
		hottub.heat()
		hottub.bubblesOn()
	}
}
