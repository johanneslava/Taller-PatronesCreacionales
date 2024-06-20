package org.unisabana.producto;

public class CrearPizza implements AmasarPizza, MoldeadorPizza, HorneadorPizza{

    String tamano;
    String[] ingredientes;
    String tipo;

    public CrearPizza(String tamano, String[] ingredientes, String tipo) {
        this.tamano = tamano;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
        amasar();
        moldear();
        hornear();

    }

    @Override
    public String amasar() {
        System.out.println("Amasar Pizza"+tipo);
        return "amasando pizza" +tipo;
    }

    @Override
    public String hornear() {
        System.out.println("Hornear Pizza"+tipo);
        return "horneando pizza" +tipo;
    }

    @Override
    public String moldear() {
        System.out.println("Moldear Pizza"+tipo);
        return "moldeando pizza" +tipo;
    }
}
