package org.unisabana;

public class Main {

    public static void main(String[] args) {

        PizzaFactory pizzaDelgada = new PizzaDelgadaFactory();
        pizzaDelgada.crearPizza("mediana", new String[]{"tomate", "queso"}, "delgada");

    }

    public void prepararPizza(){
        //amasar
        //moldear
        //hornear
    }
}
