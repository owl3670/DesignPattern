package strategy

import strategy.behavior.FlyRocketPowered
import strategy.duck.MallardDuck
import strategy.duck.ModelDuck

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