package singleton.enumS

class SingletonController {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val singleton = Singleton.UNIQUE_INSTANCE
            println(singleton.description())
        }
    }
}