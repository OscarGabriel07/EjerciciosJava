package com.sofka.ejercicio9;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String nuevaFrase = "De todas las cosas que llevas puestas, tu actitud es la más importante";
        Logger logger = Logger.getLogger(com.sofka.ejercicio9.Main.class.getName());
        String fraseTransformada = reemplazarLetraAPorLetraE(frase);
        String fraseConcatenada = concatenarFrases(fraseTransformada, nuevaFrase);
        logger.info(fraseConcatenada);
    }

    public static String reemplazarLetraAPorLetraE(String frase){
        return  frase.replace("a", "e");
    }

    public static String concatenarFrases(String frase1, String frase2){
        return frase1 + ". " + frase2;
    }
}
