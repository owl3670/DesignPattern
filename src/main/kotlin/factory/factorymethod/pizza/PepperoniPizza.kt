package factory.factorymethod.pizza

import factory.factorymethod.pizza.Pizza

class PepperoniPizza : Pizza() {
    init {
        name = "Pepperoni Pizza"
        dough = "Crust"
        sauce = "Marinara sauce"
        toppings.add("Sliced Pepperoni")
        toppings.add("Sliced Onion")
        toppings.add("Grated parmesan cheese")
    }
}