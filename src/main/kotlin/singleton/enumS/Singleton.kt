package singleton.enumS

enum class Singleton {
    UNIQUE_INSTANCE;

    fun description(): String {
        return "I'm a enum Singleton!"
    }
}