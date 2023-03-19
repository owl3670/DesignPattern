package command.remote

class Light(
    private val location: String
) {
    var level : Int = 0
        private set

    fun on() {
        level = 100
        println("$location light is on")
    }

    fun off() {
        level = 0
        println("$location light is off")
    }
}