package strategy.duck

import strategy.behavior.FlyWithWings
import strategy.behavior.Quack

class MallardDuck : Duck() {
    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I'm a real Mallard duck")
    }
}