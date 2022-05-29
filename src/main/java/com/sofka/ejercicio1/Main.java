package com.sofka.ejercicio1;

import org.jboss.logging.Logger;

/**
 * Clase de prueba para el ejercicio 1 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        calculateLargestNumber(3, 5);
    }
    /**
     * Compara dos números e indica cuál es el mayor
     *
     * @param numberOne recibe el primer número a comparar
     * @param numberTwo recibe el segundo número a comparar
     */
    public static void calculateLargestNumber(int numberOne, int numberTwo){
        if(numberOne > numberTwo){
            logger.info("El número " + numberOne + " es mayor al " + numberTwo);
        } else if (numberOne < numberTwo) {
            logger.info("El número " + numberTwo + " es mayor al " + numberOne);
        }else {
            logger.info("Los números son iguales");
        }
    }
}
