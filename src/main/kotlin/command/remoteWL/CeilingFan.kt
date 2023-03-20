package command.remoteWL

class CeilingFan(
    private val location : String
) {
    companion object {
        const val HIGH = 3
        const val MEDIUM = 2
        const val LOW = 1
        const val OFF = 0
    }

    var speed = OFF
    private set

    fun high() {
        speed = HIGH
        println("$location ceiling fan is on high")
    }

    fun medium() {
        speed = MEDIUM
        println("$location ceiling fan is on medium")
    }

    fun low() {
        speed = LOW
        println("$location ceiling fan is on low")
    }

    fun off() {
        speed = OFF
        println("$location ceiling fan is off")
    }
}