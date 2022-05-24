package com.sofka.ejercicio4;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(com.sofka.ejercicio4.Main.class.getName());
        Scanner leer = new Scanner(System.in);
        double precio;
        logger.info("Por favor ingresa el precio del producto");
        precio = Double.parseDouble(leer.nextLine());
        calcularPrecioConIva(precio);
    }

    public static void calcularPrecioConIva(double precio){
        Logger logger = Logger.getLogger(com.sofka.ejercicio4.Main.class.getName());
        double porcentajeIva = 21;
        double precioConIva = ((precio * porcentajeIva) / 100 + precio);
        String resultado = "El precio del producto incluyendo el IVA del 21% es: " + precioConIva;
        logger.info(resultado);
    }
}
