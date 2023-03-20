package command.remoteWL

class TV(
    private val location: String
) {
    private var channel = 0

    fun on() {
        println("$location TV is on")
    }

    fun off() {
        println("$location TV is off")
    }

    fun setInputChannel() {
        this.channel = 3
        println("$location TV is set for DVD")
    }
}