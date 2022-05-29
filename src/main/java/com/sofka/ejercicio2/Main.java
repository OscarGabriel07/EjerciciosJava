package com.sofka.ejercicio2;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 2 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        logger.info("Por favor ingresa un número");
        numberOne = Integer.parseInt(read.nextLine());
        logger.info("Por favor ingresa otro número");
        numberTwo = Integer.parseInt(read.nextLine());
        calculateLargestNumber(numberOne, numberTwo);
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
