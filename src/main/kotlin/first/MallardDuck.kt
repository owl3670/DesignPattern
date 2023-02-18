package first

import first.behavior.FlyWithWings
import first.behavior.Quack

class MallardDuck : Duck() {
    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }

    override fun display() {
        println("I'm a real Mallard duck")
    }
}