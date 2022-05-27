package com.sofka.ejercicio17;

import java.util.HashMap;

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    protected String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};

    public Electrodomestico(){
        this.precioBase= 100;
        this.color = colores[0];
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso){
        this.precioBase = precioBase;
        this.color = colores[0];
        this.consumoEnergetico = 'F';
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso){
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public String getColor() {
        return this.color;
    }

    public char getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public double getPeso() {
        return this.peso;
    }
    protected void comprobarConsumoEnergetico(char consumo){
        if(consumo == 'A' || consumo == 'B' || consumo == 'C' || consumo == 'D' || consumo == 'E' || consumo == 'F'){
            this.consumoEnergetico = consumo;
        }else {
            this.consumoEnergetico = 'F';
        }
    }

    protected void comprobarColor(String color){
        color = color.toLowerCase();
        if(color.equals("blanco") ||  color.equals("negro") || color.equals("rojo")
                ||  color.equals("azul") ||  color.equals("gris")){
            this.color = color;
        }else {
            this.color = colores[0];
        }
    }

    protected double precioFinal(){
        double precioFinal = this.precioBase;
        HashMap<Character, Integer> preciosPorConsumo = new HashMap<>();
        preciosPorConsumo.put('A', 100);
        preciosPorConsumo.put('B', 80);
        preciosPorConsumo.put('C', 60);
        preciosPorConsumo.put('D', 50);
        preciosPorConsumo.put('E', 30);
        preciosPorConsumo.put('F', 10);
        precioFinal += Integer.parseInt(preciosPorConsumo.get(this.consumoEnergetico).toString());

        if(this.peso >= 0 && this.peso <= 19){
            precioFinal += 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 50;
        }else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 80;
        }else {
            precioFinal += 100;
        }
        return precioFinal;
    }

}
