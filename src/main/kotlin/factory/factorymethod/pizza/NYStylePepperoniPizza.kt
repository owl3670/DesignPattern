package factory.factorymethod.pizza

import factory.factorymethod.pizza.Pizza

class NYStylePepperoniPizza : Pizza() {
    init {
        name = "NY Style Sauce and Pepperoni Pizza"
        dough = "Thin Crust Dough"
        sauce = "Marinara Sauce"
        toppings.add("Grated Reggiano Cheese")
        toppings.add("Sliced Pepperoni")
        toppings.add("Garlic")
        toppings.add("Onion")
        toppings.add("Mushrooms")
        toppings.add("Red Pepper")
    }
}