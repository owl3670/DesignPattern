package factory.factorymethod.pizza

import factory.factorymethod.pizza.Pizza

class ClamPizza : Pizza() {
    init {
        name = "Clam Pizza"
        dough = "Thin crust"
        sauce = "White garlic sauce"
        toppings.add("Clams")
        toppings.add("Grated parmesan cheese")
    }
}