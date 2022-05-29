package com.sofka.ejercicio17;

import java.util.HashMap;

/**
 * Electrodoméstico representará a una electrodoméstico
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Electrodomestico {
    protected double basePrice;
    protected String color;
    protected char energyConsumption;
    protected double weight;
    protected String[] colors = {"blanco", "negro", "rojo", "azul", "gris"};
    /**
     * Crea un electrodoméstico con todos sus atributos inicializados por default
     */
    public Electrodomestico(){
        this.basePrice= 100;
        this.color = colors[0];
        this.energyConsumption = 'F';
        this.weight = 5;
    }
    /**
     * Crea un electrodoméstico que recibe como parámetros el precio base y el peso
     *
     * @param basePrice precio base del electrodoméstico
     * @param weight peso del electrodoméstico
     */
    public Electrodomestico(double basePrice, double weight){
        this.basePrice = basePrice;
        this.color = colors[0];
        this.energyConsumption = 'F';
        this.weight = weight;
    }
    /**
     * Crea un electrodoméstico que recibe como parámetros el precio base, color, consumo energético y el peso
     *
     * @param basePrice precio base del electrodoméstico
     * @param color color del electrodoméstico
     * @param energyConsumption consumo energético del electrodoméstico
     * @param weight peso del electrodoméstico
     */
    public Electrodomestico(double basePrice, String color, char energyConsumption, double weight){
        this.basePrice = basePrice;
        checkColor(color);
        checkEnergyConsumption(energyConsumption);
        this.weight = weight;
    }
    /**
     * Retorna el precio base del electrodoméstico
     *
     * @return devuelve el precio base del electrodoméstico
     */
    public double getBasePrice() {
        return this.basePrice;
    }
    /**
     * Retorna el color del electrodoméstico
     *
     * @return devuelve el color del electrodoméstico
     */
    public String getColor() {
        return this.color;
    }
    /**
     * Retorna el consumo energético del electrodoméstico
     *
     * @return devuelve el consumo energético del electrodoméstico
     */
    public char getEnergyConsumption() {
        return this.energyConsumption;
    }
    /**
     * Retorna el peso del electrodoméstico
     *
     * @return devuelve el peso del electrodoméstico
     */
    public double getWeight() {
        return this.weight;
    }
    /**
     * Comprueba el consumo energético del electrodoméstico y si es diferente de A, B, C, D, E, F; asigna F por default
     *
     * @param consumption recibe consumo a comprobar
     */
    protected void checkEnergyConsumption(char consumption){
        if(consumption == 'A' || consumption == 'B' || consumption == 'C' || consumption == 'D' || consumption == 'E' || consumption == 'F'){
            this.energyConsumption = consumption;
        }else {
            this.energyConsumption = 'F';
        }
    }
    /**
     * Comprueba el color del electrodoméstico y si es diferente de blanco, negro, rojo, azul, gris;
     * le asigna blanco por default
     *
     * @param color recibe el color a comprobar
     */
    protected void checkColor(String color){
        color = color.toLowerCase();
        if(color.equals("blanco") ||  color.equals("negro") || color.equals("rojo")
                ||  color.equals("azul") ||  color.equals("gris")){
            this.color = color;
        }else {
            this.color = colors[0];
        }
    }
    /**
     * Calcula el precio final teniendo en cuenta las condiciones del consumo energético y peso
     *
     * @return devuelve el precio final teniendo en cuenta las condiciones del consumo energético y peso
     */
    protected double finalPrice(){
        double finalPrice = this.basePrice;
        HashMap<Character, Integer> pricesPerConsumption = new HashMap<>();
        pricesPerConsumption.put('A', 100);
        pricesPerConsumption.put('B', 80);
        pricesPerConsumption.put('C', 60);
        pricesPerConsumption.put('D', 50);
        pricesPerConsumption.put('E', 30);
        pricesPerConsumption.put('F', 10);
        finalPrice += Integer.parseInt(pricesPerConsumption.get(this.energyConsumption).toString());

        if(this.weight >= 0 && this.weight <= 19){
            finalPrice += 10;
        } else if (this.weight >= 20 && this.weight <= 49) {
            finalPrice += 50;
        }else if (this.weight >= 50 && this.weight <= 79) {
            finalPrice += 80;
        }else {
            finalPrice += 100;
        }
        return finalPrice;
    }

}
