package com.sofka.ejercicio17;

public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora(){
        super();
        this.carga = 5;
    }

    public Lavadora(double precio, double peso){
        super(precio, peso);
        this.carga = 5;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return this.carga;
    }

    @Override
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        if(this.carga >= 30){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
