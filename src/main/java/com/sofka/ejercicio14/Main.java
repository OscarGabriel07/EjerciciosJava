package com.sofka.ejercicio14;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 14 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        logger.info("Por favor ingresa un número");
        int initialNumber = Integer.parseInt(read.nextLine());
        showNumbersTwoByTwoUpToAThousand(initialNumber);
    }

    /**
     * Muestra los números de dos en dos hasta el mil partiendo de un número pasado como parámetro
     *
     * @param initialNumber recibe el número desde donde se empiezan a imprimir los números
     */
    public static void showNumbersTwoByTwoUpToAThousand(int initialNumber){
        while (initialNumber <= 1000){
            logger.info(initialNumber);
            initialNumber += 2;
        }
    }
}
