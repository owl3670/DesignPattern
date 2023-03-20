package command.remoteWL

class GarageDoor(
    private val location: String
) {
    fun up() {
        println("$location Garage Door is Up")
    }

    fun down() {
        println("$location Garage Door is Down")
    }

    fun stop() {
        println("$location Garage Door is Stopped")
    }

    fun lightOn() {
        println("$location Garage light is on")
    }

    fun lightOff() {
        println("$location Garage light is off")
    }
}