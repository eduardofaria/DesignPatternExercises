package com.pizza;

import com.pizza.factory.SimplePizzaFactory;


public class Main {
    


    public static void main(String[] args) {

        System.out.println("Hello world!");

        //SimplePizzaFactory factory = new SimplePizzaFactory();
        //PizzaStore pedido = new PizzaStore(factory);
        PizzaStore pedido = new PizzaStore(new SimplePizzaFactory());
        pedido.orderPizza("cheese");
    

        
    }
}