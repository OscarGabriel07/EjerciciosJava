package com.sofka.ejercicio2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(com.sofka.ejercicio1.Main.class.getName());
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        logger.info("Por favor ingresa un número");
        numero1 = Integer.parseInt(leer.nextLine());
        logger.info("Por favor ingresa otro número");
        numero2 = Integer.parseInt(leer.nextLine());
        calcularNumeroMayor(numero1, numero2);
    }
    public static void calcularNumeroMayor(int numero1, int numero2){
        Logger logger = Logger.getLogger(com.sofka.ejercicio1.Main.class.getName());
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
