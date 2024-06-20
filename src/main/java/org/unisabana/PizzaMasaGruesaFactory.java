package org.unisabana;

import org.unisabana.producto.CrearPizza;

public class PizzaMasaGruesaFactory implements PizzaFactory{

    @Override
    public CrearPizza crearPizza(String tamano, String[] ingredientes, String tipo) {
        return new CrearPizza(tamano, ingredientes, tipo);
    }
}
