package com.pizza.factory;

import com.pizza.model.CheesePizza;
import com.pizza.model.GreekPizza;
import com.pizza.model.PepperoniPizza;
import com.pizza.model.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("greek")){
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }

        return pizza;
    }

}
