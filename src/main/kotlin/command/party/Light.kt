package command.party

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

    fun dim(level: Int) {
        this.level = level
        if (level == 0) {
            off()
        } else {
            println("$location light is dimmed to $level%")
        }
    }
}