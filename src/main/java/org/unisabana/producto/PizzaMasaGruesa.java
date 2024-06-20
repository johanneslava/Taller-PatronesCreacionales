package org.unisabana.producto;

public class PizzaMasaGruesa implements  AmasarPizza,HorneadorPizza,MoldeadorPizza {
    @Override
    public String amasar() {
        System.out.println("amasando pizza Grande ");
        return "amasando pizza Grande ";
    }

    @Override
    public String hornear() {
        System.out.println("horneando pizza Grande ");
        return "horneando pizza Grande ";
    }

    @Override
    public String moldear() {
        System.out.println("moldeando pizza Grande ");
        return "moldeando pizza Grande ";
    }
}
