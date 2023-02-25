package singleton.classic

class Singleton {
    companion object {
        private var uniqueInstance: Singleton? = null

        fun getInstance(): Singleton {
            if (uniqueInstance == null) {
                uniqueInstance = Singleton()
            }
            return uniqueInstance!!
        }
    }

    fun getDescription(): String{
        return "I'm a classic Singleton!"
    }
}