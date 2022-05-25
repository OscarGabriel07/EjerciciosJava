package com.sofka.ejercicio14;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        Scanner leer = new Scanner(System.in);
        logger.info("Por favor ingresa un número");
        int numeroInicial = Integer.parseInt(leer.nextLine());
        imprimirDeDosEnDosHastaElMil(numeroInicial);
    }

    public static void imprimirDeDosEnDosHastaElMil(int numeroInicial){
        Logger logger = Logger.getLogger("logger");
        while (numeroInicial <= 1000){
            String numeroEnCadena = String.valueOf(numeroInicial);
            logger.severe(numeroEnCadena);
            numeroInicial += 2;
        }
    }
}
