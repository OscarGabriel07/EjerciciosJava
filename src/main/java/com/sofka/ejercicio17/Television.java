package com.sofka.ejercicio17;

/**
 * Televisión representará a un televisor que hereda de Electrodoméstico
 * En los ejemplos se usarán 5 televisores
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Television extends Electrodomestico{
    private double resolution;
    private boolean tunerTDT;

    /**
     * Crea un televisor con todos los atributos de la clase inicializados por default
     */
    public Television(){
        super();
        this.resolution = 20;
        this.tunerTDT = false;
    }
    /**
     * Crea un televisor que recibe como parámetros el precio y el peso
     *
     * @param price precio del televisor
     * @param weight peso del televisor
     */
    public Television(double price, double weight){
        super(price, weight);
        this.resolution = 20;
        this.tunerTDT = false;
    }
    /**
     * Crea un televisor que recibe como parámetros el precio base, color, consumo energético, el peso,
     * la resolución en pulgadas y si cuenta con sintonizador TDT
     *
     * @param basePrice precio base del televisor
     * @param color color del televisor
     * @param energyConsumption consumo energético del televisor
     * @param weight peso del televisor
     * @param resolution resolución del televisor
     * @param tunerTDT sintonizador TDT del televisor
     */
    public Television(double basePrice, String color, char energyConsumption, double weight, double resolution, boolean tunerTDT){
        super(basePrice, color, energyConsumption, weight);
        this.resolution = resolution;
        this.tunerTDT = tunerTDT;
    }
    /**
     * Retorna la resolución en pulgadas del televisor
     *
     * @return devuelve la resolución en pulgadas del televisor
     */
    public double getResolution() {
        return this.resolution;
    }
    /**
     * Retorna true o false dependiendo si el televisor tiene sintonizador TDT
     *
     * @return devuelve true o false dependiendo si el televisor tiene sintonizador TDT
     */
    public boolean isTunerTDT() {
        return this.tunerTDT;
    }
    /**
     * Calcula el precio final teniendo en cuenta las condiciones de la resolución y el sintonizador TDT
     *
     * @return devuelve el precio final teniendo en cuenta las condiciones de la resolución y el sintonizador TDT
     */
    @Override
    public double finalPrice(){
        double finalPrice = super.finalPrice();
        double increase = 0;
        if(this.resolution >= 40){
            increase = finalPrice * 0.3;
            finalPrice += increase;
        }
        if(this.tunerTDT){
            finalPrice += 50;
        }
        return finalPrice;
    }
}
