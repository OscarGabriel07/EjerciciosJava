package com.sofka.ejercicio3;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(com.sofka.ejercicio3.Main.class.getName());
        Scanner leer = new Scanner(System.in);
        double radio;
        logger.info("Por favor ingresa el radio del círculo en centímetros");
        radio = Double.parseDouble(leer.nextLine());
        calcularAreaCirculo(radio);
    }

    public static void calcularAreaCirculo(double radio){
        Logger logger = Logger.getLogger(com.sofka.ejercicio3.Main.class.getName());
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        String resultado = "El área del círculo es " + areaCirculo + " cm^2";
        logger.info(resultado);
    }
}
