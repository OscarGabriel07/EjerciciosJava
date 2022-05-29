package com.sofka.ejercicio9;

import org.jboss.logging.Logger;

/**
 * Clase de prueba para el ejercicio 9 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        String phrase = "La sonrisa sera la mejor arma contra la tristeza.";
        String newPhrase = "De todas las cosas que llevas puestas, tu actitud es la más importante.";
        replaceLetterAWithLetterE(phrase);
        concatenatePhrases(phrase, newPhrase);
    }

    /**
     * Reemplaza la letra A por la letra E en la frase ingresada como parámetro
     *
     * @param phrase recibe la frase que va a ser transformada
     */
    public static void replaceLetterAWithLetterE(String phrase){
        logger.info(phrase.replace("a", "e"));
    }
    /**
     * Concatena las dos frases ingresadas como parámetro
     *
     * @param phraseOne recibe la primera frase de la concatenación
     * @param phraseTwo recibe la segunda frase de la concatenación
     */
    public static void concatenatePhrases(String phraseOne, String phraseTwo){
        logger.info(phraseOne + " " + phraseTwo);
    }
}
