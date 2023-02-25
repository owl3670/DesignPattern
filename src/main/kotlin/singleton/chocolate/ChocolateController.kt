package singleton.chocolate

class ChocolateController {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val boiler = ChocolateBoiler.getInstance()
            boiler.fill()
            boiler.boil()
            boiler.drain()

            val boiler2 = ChocolateBoiler.getInstance()
        }
    }
}