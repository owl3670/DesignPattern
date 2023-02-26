package singleton.threadsafe

class Singleton {
    companion object {
        private var uniqueInstance: Singleton? = null

        @Synchronized
        fun getInstance(): Singleton {
            if (uniqueInstance == null) {
                uniqueInstance = Singleton()
            }
            return uniqueInstance!!
        }
    }

    fun description(): String {
        return "I'm a thread safe Singleton!"
    }
}