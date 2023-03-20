package command.remoteWL;

class Hottub {
	var on: Boolean = false
		private set
	var temperature: Int = 0

	fun on() {
		on = true
	}

	fun off() {
		on = false
	}

	fun bubblesOn() {
		if (on) {
			println("Hottub is bubbling!")
		}
	}

	fun circulate() {
		if (on) {
			println("Hottub is bubbling!")
		}
	}

	fun jetsOn() {
		if (on) {
			println("Hottub jets are on")
		}
	}

	fun jetsOff() {
		if (on) {
			println("Hottub jets are off")
		}
	}

	fun heat() {
		temperature = 105
		println("Hottub is heating to a steaming 105 degrees")
	}

	fun cool() {
		temperature = 98
		println("Hottub is cooling to 98 degrees")
	}
}
