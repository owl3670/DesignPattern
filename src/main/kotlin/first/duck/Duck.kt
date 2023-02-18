package first.duck

import first.behavior.FlyBehavior
import first.behavior.FlyWithWings
import first.behavior.Quack
import first.behavior.QuackBehavior

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