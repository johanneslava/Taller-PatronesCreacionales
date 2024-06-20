package org.unisabana.producto;

public class PizzaMasaDelgada implements  AmasarPizza,HorneadorPizza,MoldeadorPizza {


    public PizzaMasaDelgada() {
        amasar();
        moldear();
        hornear();
    }

    @Override
    public String amasar() {
        System.out.println("amasando pizza delgada ");
        return "amasando pizza delgada ";
    }

    @Override
    public String hornear() {

        System.out.println("horneando pizza delgada ");
        return "horneando pizza delgada ";

    }

    @Override
    public String moldear() {
        System.out.println("moldeando pizza delgada ");
        return "moldeando pizza delgada ";
    }
}
