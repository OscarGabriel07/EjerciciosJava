package com.sofka.ejercicio3;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 3 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {

    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double radius;
        logger.info("Por favor ingresa el radio del círculo en centímetros");
        radius = Double.parseDouble(read.nextLine());
        calculateCircleArea(radius);
    }

    /**
     * Calcula el área de un círculo
     *
     * @param radius recibe el radio del circulo
     */
    public static void calculateCircleArea(double radius){

        double circleArea = Math.PI * Math.pow(radius, 2);
        logger.info("El área del círculo es " + circleArea + " cm^2");
    }
}
