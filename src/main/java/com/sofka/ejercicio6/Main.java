package com.sofka.ejercicio6;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(com.sofka.ejercicio6.Main.class.getName());
        logger.info("Se muestran los números impares del 1 al 100 usando ciclo for");
        mostrarNumerosImparesUnoAlCien();
        logger.info("**************************************************************************");
        logger.info("Se muestran los números pares del 1 al 100 usando ciclo for");
        mostrarNumerosParesUnoAlCien();
    }
    public static void mostrarNumerosImparesUnoAlCien(){
        Logger logger = Logger.getLogger(com.sofka.ejercicio6.Main.class.getName());
        String temporal = "";
        for(int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                temporal = String.valueOf(i);
                logger.info(temporal);
            }
        }
    }

    public static void mostrarNumerosParesUnoAlCien(){
        Logger logger = Logger.getLogger(com.sofka.ejercicio6.Main.class.getName());
        String temporal = "";
        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                temporal = String.valueOf(i);
                logger.info(temporal);
            }
        }
    }
}
