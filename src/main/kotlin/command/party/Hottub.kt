package command.party;

class Hottub {
	var on: Boolean = false
		private set
	var temperature: Int = 0
	set(value) {
		if (value > field) {
			println("Hottub is heating to a steaming $value degrees")
		} else {
			println("Hottub is cooling to $value degrees")
		}
		field = value
	}

	fun on() {
		on = true
	}

	fun off() {
		on = false
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
}
