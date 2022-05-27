package com.sofka.ejercicio17;

public class Television extends Electrodomestico{
    private double resolucion;
    private boolean sintonizadorTDT;

    public Television(){
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precio, double peso){
        super(precio, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT){
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return this.resolucion;
    }

    public boolean isSintonizadorTDT() {
        return this.sintonizadorTDT;
    }
    @Override
    public double precioFinal(){
        double precioFinal = super.precioFinal();
        double aumento = 0;
        if(this.resolucion >= 40){
            aumento = precioFinal * 0.3;
            precioFinal += aumento;
        }
        if(this.sintonizadorTDT){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
