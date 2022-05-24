package com.sofka.ejercicio1;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        calcularNumeroMayor(7, 4);
    }

    public static void calcularNumeroMayor(int numero1, int numero2){
        Logger logger = Logger.getLogger(Main.class.getName());
        String resultado = "";
        if(numero1 > numero2){
            resultado = "El número " + numero1 + " es mayor al " + numero2;
        } else if (numero1 < numero2) {
            resultado = "El número " + numero2 + " es mayor al " + numero1;
        }else {
            resultado = "Los números son iguales";
        }
        logger.info(resultado);
    }
}
