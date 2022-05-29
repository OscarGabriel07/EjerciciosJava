package com.sofka.ejercicio7;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 7 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        do {
            logger.info("Por favor ingresa un número");
            number = Integer.parseInt(read.nextLine());
        }while (number < 0);
        logger.info("El número ingresado fue: " + number);
    }
}
