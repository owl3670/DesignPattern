package first

class MiniDuckSimulator {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val mallard = MallardDuck()
            mallard.performQuack()
            mallard.performFly()
        }
    }
}