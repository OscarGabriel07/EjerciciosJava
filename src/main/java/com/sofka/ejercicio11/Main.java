package com.sofka.ejercicio11;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 11 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        logger.info("Por favor ingresa una frase");
        String phrase = read.nextLine();
        showPhraseLength(phrase);
        countVowels(phrase, 'a');
        countVowels(phrase, 'e');
        countVowels(phrase, 'i');
        countVowels(phrase, 'o');
        countVowels(phrase, 'u');
    }

    /**
     * Muestra la longitud de la frase
     *
     * @param phrase recibe la frase a la que se le mostrará su longitud
     */
    public static void showPhraseLength(String phrase){
        logger.info("La longitud de la frase es: " + phrase.length());
    }
    /**
     * Muestra la cantidad de cierta vocal que tiene la frase
     *
     * @param phrase recibe la frase a la que se le mostrará cantidad de cierta vocal que tiene
     * @param vocal recibe la vocal que se buscará en la frase
     */
    public static void countVowels(String phrase, char vocal){
        int countVowel = 0;
        for (int i = 0; i < phrase.length(); i++){
            if(phrase.toLowerCase().charAt(i) == vocal){
                countVowel++;
            }
        }
        logger.info("La cantidad de vocales " + vocal + " en la frase es: " + countVowel);
    }
}
