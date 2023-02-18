package first.duck

import first.behavior.FlyNoWay
import first.behavior.Quack

class ModelDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }

    override fun display() {
        println("I'm a model duck")
    }
}