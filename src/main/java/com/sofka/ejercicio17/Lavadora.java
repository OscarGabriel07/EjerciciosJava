package com.sofka.ejercicio17;

/**
 * Lavadora representará a una lavadora que hereda de Electrodoméstico
 * En los ejemplos se usarán 5 lavadoras
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Lavadora extends Electrodomestico {
    private double charge;

    /**
     * Crea una lavadora con todos los atributos de la clase inicializados por default
     */
    public Lavadora(){
        super();
        this.charge = 5;
    }
    /**
     * Crea una lavadora que recibe como parámetros el precio y el peso
     *
     * @param price precio de la lavadora
     * @param weight peso de la lavadora
     */
    public Lavadora(double price, double weight){
        super(price, weight);
        this.charge = 5;
    }
    /**
     * Crea una lavadora que recibe como parámetros el precio base, color, consumo energético, el peso y la carga
     *
     * @param basePrice
     * @param color
     * @param energyConsumption
     * @param weight
     * @param charge
     */
    public Lavadora(double basePrice, String color, char energyConsumption, double weight, double charge){
        super(basePrice, color, energyConsumption, weight);
        this.charge = charge;
    }

    /**
     * Retorna la carga de la lavadora
     *
     * @return devuelve la carga de la lavadora
     */
    public double getCharge() {
        return this.charge;
    }

    /**
     * Calcula el precio final teniendo en cuenta las condiciones de la carga
     *
     * @return devuelve el precio final teniendo en cuenta las condiciones de la carga
     */
    @Override
    public double finalPrice(){
        double finalPrice = super.finalPrice();
        if(this.charge >= 30){
            finalPrice += 50;
        }
        return finalPrice;
    }
}
