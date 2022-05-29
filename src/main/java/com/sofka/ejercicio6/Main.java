package com.sofka.ejercicio6;

import org.jboss.logging.Logger;

/**
 * Clase de prueba para el ejercicio 6 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        logger.info("Se muestran los números impares del 1 al 100 usando ciclo for");
        showOddNumbersFromOneToOneHundred();
        logger.info("**************************************************************************");
        logger.info("Se muestran los números pares del 1 al 100 usando ciclo for");
        showEvenNumbersFromOneToOneHundred();
    }

    /**
     * Muestra los números impares del 1 al 100 usando ciclo for
     */
    public static void showOddNumbersFromOneToOneHundred(){
        for(int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                logger.info(i);
            }
        }
    }
    /**
     * Muestra los números impares del 1 al 100 usando ciclo for
     */
    public static void showEvenNumbersFromOneToOneHundred(){
        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                logger.info(i);
            }
        }
    }
}
