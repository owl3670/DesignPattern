package singleton.dcl

class SingletonController {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val singleton = Singleton.getInstance()
            println(singleton.description())
        }
    }
}