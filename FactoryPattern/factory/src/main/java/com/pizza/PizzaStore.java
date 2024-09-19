package com.pizza;
import com.pizza.factory.SimplePizzaFactory;
import com.pizza.model.Pizza;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
        
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        System.out.println("Pediram uma pizza de " + type);

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}