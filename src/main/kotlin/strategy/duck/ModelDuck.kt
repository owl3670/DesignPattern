package strategy.duck

import strategy.behavior.FlyNoWay
import strategy.behavior.Quack

class ModelDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }

    override fun display() {
        println("I'm a model duck")
    }
}