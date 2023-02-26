package singleton.stat

class Singleton {
    companion object {
        private var uniqueInstance: Singleton = Singleton()

        fun getInstance(): Singleton {
            return uniqueInstance
        }
    }

    fun description(): String {
        return "I'm a static Singleton!"
    }
}