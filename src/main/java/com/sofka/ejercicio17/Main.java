package com.sofka.ejercicio17;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        Lavadora lavadora1 = new Lavadora(30, "blanco", 'E', 50, 18);
        Lavadora lavadora2 = new Lavadora(40, "azul", 'A', 60, 30);
        Lavadora lavadora3 = new Lavadora(50, "gris", 'D', 21, 33);
        Lavadora lavadora4 = new Lavadora(60, "morado", 'Z', 18, 17);
        Lavadora lavadora5 = new Lavadora(46, "negro", 'F', 81, 19);
        Television television1 = new Television(25, "negro", 'A', 28, 32, true);
        Television television2 = new Television(30, "gris", 'B', 29, 60, false);
        Television television3 = new Television(24, "verde", 'K', 60, 21, false);
        Television television4 = new Television(45, "blanco", 'C', 65, 42, true);
        Television television5 = new Television(50, "rojo", 'D', 17, 80, true);

        Electrodomestico[] electrodomesticos = {lavadora1, lavadora2, lavadora3, lavadora4, lavadora5,
                television1, television2, television3, television4, television5};
        String preciosFinalesImpresos;

        for (int i = 0; i < electrodomesticos.length; i++) {
            preciosFinalesImpresos = "Precio Final Elemento " + (i + 1) + ": " + electrodomesticos[i].precioFinal();
            logger.info(preciosFinalesImpresos);
        }

        double sumaElectrodomesticos = 0;
        double sumaLavadoras = 0;
        double sumaTelevisores = 0;

        for (Electrodomestico elemento : electrodomesticos) {
            if (elemento instanceof Electrodomestico) {
                sumaElectrodomesticos += elemento.precioFinal();
            }
            if (elemento instanceof Lavadora) {
                sumaLavadoras += elemento.precioFinal();
            }
            if (elemento instanceof Television) {
                sumaTelevisores += elemento.precioFinal();
            }
        }
        String sumaElectrodomesticosImpresa = "La suma del precio de Electrodomésticos es: " + sumaElectrodomesticos;
        String sumaLavadorasImpresa = "La suma del precio de Lavadoras es: " + sumaLavadoras;
        String sumaTelevisoresImpresa = "La suma del precio de Televisores es: "+ sumaTelevisores;
        logger.info("------------------------------------------------------------------------------");
        logger.info(sumaElectrodomesticosImpresa);
        logger.info((sumaLavadorasImpresa));
        logger.info((sumaTelevisoresImpresa));
    }
}

