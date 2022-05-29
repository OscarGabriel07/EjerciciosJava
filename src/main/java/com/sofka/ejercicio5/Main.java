package com.sofka.ejercicio5;

import org.jboss.logging.Logger;

/**
 * Clase de prueba para el ejercicio 5 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        logger.info("Se muestran los números impares del 1 al 100 usando ciclo while");
        showOddNumbersFromOneToOneHundred();
        logger.info("**************************************************************************");
        logger.info("Se muestran los números pares del 1 al 100 usando ciclo while");
        showEvenNumbersFromOneToOneHundred();
    }

    /**
     * Muestra los números impares del 1 al 100 usando ciclo while
     */
    public static void showOddNumbersFromOneToOneHundred(){
        int count = 1;
        while(count <= 100){
            if (count % 2 != 0){
                logger.info(count);
            }
            count++;
        }
    }
    /**
     * Muestra los números pares del 1 al 100 usando ciclo while
     */
    public static void showEvenNumbersFromOneToOneHundred(){
        int count = 1;
        while(count <= 100){
            if (count % 2 == 0){
                logger.info(count);
            }
            count++;
        }
    }
}
