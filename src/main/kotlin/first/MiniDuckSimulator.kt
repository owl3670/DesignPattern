package first

import first.behavior.FlyRocketPowered
import first.duck.MallardDuck
import first.duck.ModelDuck

class MiniDuckSimulator {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val mallard = MallardDuck()
            mallard.performQuack()
            mallard.performFly()

            val model = ModelDuck()
            model.performFly()
            model.flyBehavior = FlyRocketPowered()
            model.performFly()
        }
    }
}