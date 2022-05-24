package com.sofka.ejercicio7;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Logger logger = Logger.getLogger(com.sofka.ejercicio7.Main.class.getName());
        String resultado = "";
        int numero;
        do {
            logger.info("Por favor ingresa un número");
            numero = Integer.parseInt(leer.nextLine());
        }while (numero < 0);
        resultado = "El número ingresado fue: " + numero;
        logger.info(resultado);
    }

}
