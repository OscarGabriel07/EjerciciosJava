package com.sofka.ejercicio5;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(com.sofka.ejercicio5.Main.class.getName());
        logger.info("Se muestran los números impares del 1 al 100");
        mostrarNumerosImparesUnoAlCien();
        logger.info("**************************************************************************");
        logger.info("Se muestran los números pares del 1 al 100");
        mostrarNumerosParesUnoAlCien();
    }
    public static void mostrarNumerosImparesUnoAlCien(){
        Logger logger = Logger.getLogger(com.sofka.ejercicio5.Main.class.getName());
        int contador = 1;
        String temporal = "";
        while(contador <= 100){
            if (contador % 2 != 0){
                temporal = String.valueOf(contador);
                logger.info(temporal);
            }
            contador++;
        }
    }

    public static void mostrarNumerosParesUnoAlCien(){
        Logger logger = Logger.getLogger(com.sofka.ejercicio5.Main.class.getName());
        int contador = 1;
        String temporal = "";
        while(contador <= 100){
            if (contador % 2 == 0){
                temporal = String.valueOf(contador);
                logger.info(temporal);
            }
            contador++;
        }
    }
}
