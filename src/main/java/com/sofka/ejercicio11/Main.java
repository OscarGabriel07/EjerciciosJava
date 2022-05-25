package com.sofka.ejercicio11;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(com.sofka.ejercicio11.Main.class.getName());
        Scanner leer = new Scanner(System.in);
        logger.info("Por favor ingresa una frase");
        String frase = leer.nextLine();
        String longitudFrase = "La longitud de la frase es: " + hallarLongitudFrase(frase);
        String cantidadVocales = "Cantidad de vocales A: " + calcularCantidadVocalesA(frase)
                + ", Cantidad de vocales E: " + calcularCantidadVocalesE(frase)
                + ", Cantidad de vocales I: " + calcularCantidadVocalesI(frase)
                + ", Cantidad de vocales O: " + calcularCantidadVocalesO(frase)
                + ", Cantidad de vocales U: " + calcularCantidadVocalesU(frase);
        logger.info(longitudFrase);
        logger.info(cantidadVocales);
    }
    public static int hallarLongitudFrase(String frase){
        return frase.length();
    }
    public static int calcularCantidadVocalesA(String frase){
        int vocalA = 0;
        for (int i = 0; i < frase.length(); i++){
            if(frase.toLowerCase().charAt(i) == 'a'){
                vocalA++;
            }
        }
        return vocalA;
    }
    public static int calcularCantidadVocalesE(String frase){
        int vocalE = 0;
        for (int i = 0; i < frase.length(); i++){
            if(frase.toLowerCase().charAt(i) == 'e'){
                vocalE++;
            }
        }
        return vocalE;
    }
    public static int calcularCantidadVocalesI(String frase){
        int vocalI = 0;
        for (int i = 0; i < frase.length(); i++){
            if(frase.toLowerCase().charAt(i) == 'i'){
                vocalI++;
            }
        }
        return vocalI;
    }
    public static int calcularCantidadVocalesO(String frase){
        int vocalO = 0;
        for (int i = 0; i < frase.length(); i++){
            if(frase.toLowerCase().charAt(i) == 'o'){
                vocalO++;
            }
        }
        return vocalO;
    }
    public static int calcularCantidadVocalesU(String frase){
        int vocalU = 0;
        for (int i = 0; i < frase.length(); i++){
            if(frase.toLowerCase().charAt(i) == 'u'){
                vocalU++;
            }
        }
        return vocalU;
    }

}
