package com.sofka.ejercicio10;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(com.sofka.ejercicio9.Main.class.getName());
        Scanner leer = new Scanner(System.in);
        logger.info("Por favor ingresa una frase");
        String frase = leer.nextLine();
        String fraseSinEspacios = eliminarEspacios(frase);
        logger.info(fraseSinEspacios);
    }

    public static String eliminarEspacios(String frase){
        return frase.replace(" ", "");
    }
}
