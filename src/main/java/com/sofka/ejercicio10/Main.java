package com.sofka.ejercicio10;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 10 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        logger.info("Por favor ingresa una frase");
        String phrase = read.nextLine();
        removeSpaces(phrase);
    }

    /**
     * Quita los espacios de una frase ingresada por parámetro
     *
     * @param phrase recibe la frase a la que se le eliminarán los caracteres de espacio
     */
    public static void removeSpaces(String phrase){
        logger.info(phrase.replace(" ", ""));
    }
}
