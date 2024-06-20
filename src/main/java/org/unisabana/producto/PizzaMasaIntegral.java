package org.unisabana.producto;

public class PizzaMasaIntegral implements  AmasarPizza,HorneadorPizza,MoldeadorPizza{
    @Override
    public String amasar() {
        System.out.println("amasando pizza integral ");
        return "amasando pizza integral ";
    }

    @Override
    public String hornear() {
        System.out.println("horneando pizza integral ");
        return "horneando pizza integral ";
    }

    @Override
    public String moldear() {
        System.out.println("moldeando pizza integral ");
        return "moldeando pizza integral ";
    }
}
