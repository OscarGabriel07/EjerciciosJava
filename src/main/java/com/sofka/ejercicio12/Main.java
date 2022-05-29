package com.sofka.ejercicio12;

import org.jboss.logging.Logger;

import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 12 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        logger.info("Por favor ingresa una palabra");
        String wordOne = read.nextLine();
        logger.info("Por favor ingresa otra palabra");
        String wordTwo = read.nextLine();
        showWordDifference(wordOne, wordTwo);
        showWordDifference(wordTwo, wordOne);
    }

    /**
     * Muestra la diferencia entre dos palabras
     *
     * @param comparator recibe la palabra que va a comparar
     * @param compared recibe la palabra que va a ser comparada
     */
    public static void showWordDifference(String comparator, String compared){
        StringBuilder bld = new StringBuilder();
        String differences = "";
        int equalCharacterCounter;
        for (int i = 0; i < comparator.length(); i++){
            equalCharacterCounter = 0;
            for (int j = 0; j < compared.length(); j++){
                if(comparator.charAt(i) == compared.charAt(j)){
                    equalCharacterCounter++;
                }
            }
            if(equalCharacterCounter == 0){
                bld.append(comparator.charAt(i));
            }
            differences = bld.toString();
        }
        if(comparator.equals(compared)){
            logger.info("Las palabras son iguales");
        }else if(differences.equals("")){
            logger.info("La palabra " + comparator + " contiene todas las letras de la palabra "
                    + compared + " aunque pueden estar en desorden, así que no hay diferencias");
        }else {
            logger.info("La diferencia de la palabra " + comparator + " con respecto a la palabra " + compared
                    + " es: " + differences);
        }
    }
}
