package singleton.dcl

class Singleton {
    companion object {
        private var uniqueInstance: Singleton? = null

        fun getInstance(): Singleton {
            if (uniqueInstance == null) {
                synchronized(Singleton::class.java) {
                    if (uniqueInstance == null) {
                        uniqueInstance = Singleton()
                    }
                }
            }
            return uniqueInstance!!
        }
    }

    fun description(): String {
        return "I'm a double-checked locking Singleton!"
    }
}