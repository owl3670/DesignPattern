package command.dinnerLambda

class Diner {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val cook = Cook()
            val waitress = Waitress()
            val customer = Customer(waitress, cook)
            customer.createOrder()
            customer.hungry()
        }
    }
}