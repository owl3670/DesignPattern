package strategy.duck

import strategy.behavior.FlyBehavior
import strategy.behavior.FlyWithWings
import strategy.behavior.Quack
import strategy.behavior.QuackBehavior

abstract class Duck {
    var flyBehavior: FlyBehavior = FlyWithWings()
    var quackBehavior: QuackBehavior = Quack()

    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }
}