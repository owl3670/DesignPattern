package factory.factorymethod.pizza

import factory.factorymethod.pizza.Pizza

class ChicagoStyleClamPizza : Pizza() {
    init {
        name = "Chicago Style Clam Pizza"
        dough = "Extra Thick Crust Dough"
        sauce = "Plum Tomato Sauce"
        toppings.add("Shredded Mozzarella Cheese")
        toppings.add("Frozen Clams from Chesapeake Bay")
    }
}