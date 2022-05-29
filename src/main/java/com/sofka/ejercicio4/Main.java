package com.sofka.ejercicio4;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 4 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double price;
        logger.info("Por favor ingresa el precio del producto");
        price = Double.parseDouble(read.nextLine());
        calculatePriceWithIva(price);
    }

    /**
     * Calcula el precio con IVA del 21%
     *
     * @param price recibe el precio al que se le adicionará el IVA
     */
    public static void calculatePriceWithIva(double price){
        double ivaPercent = 21;
        double ivaPrice = ((price * ivaPercent) / 100 + price);
        logger.info("El precio del producto incluyendo el IVA del 21% es: " + ivaPrice);
    }
}
