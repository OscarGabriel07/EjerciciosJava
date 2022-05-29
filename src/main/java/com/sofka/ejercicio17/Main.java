package com.sofka.ejercicio17;

import org.jboss.logging.Logger;

public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        Lavadora washingMachineOne = new Lavadora(30, "blanco", 'E', 50, 18);
        Lavadora washingMachineTwo = new Lavadora(40, "azul", 'A', 60, 30);
        Lavadora washingMachineThree = new Lavadora(50, "gris", 'D', 21, 33);
        Lavadora washingMachineFour = new Lavadora(60, "morado", 'Z', 18, 17);
        Lavadora washingMachineFive = new Lavadora(46, "negro", 'F', 81, 19);
        Television televisionOne = new Television(25, "negro", 'A', 28, 32, true);
        Television televisionTwo = new Television(30, "gris", 'B', 29, 60, false);
        Television televisionThree = new Television(24, "verde", 'K', 60, 21, false);
        Television televisionFour = new Television(45, "blanco", 'C', 65, 42, true);
        Television televisionFive = new Television(50, "rojo", 'D', 17, 80, true);

        Electrodomestico[] homeAppliances = {washingMachineOne, washingMachineTwo, washingMachineThree, washingMachineFour, washingMachineFive,
                televisionOne, televisionTwo, televisionThree, televisionFour, televisionFive};

        for (int i = 0; i < homeAppliances.length; i++) {
            logger.info("Precio Final Elemento " + (i + 1) + ": " + homeAppliances[i].finalPrice());
        }

        double sumOfHouseholdAppliances = 0;
        double sumOfWashingMachines = 0;
        double sumOfTelevisions = 0;

        for (Electrodomestico element : homeAppliances) {
            if (element instanceof Electrodomestico) {
                sumOfHouseholdAppliances += element.finalPrice();
            }
            if (element instanceof Lavadora) {
                sumOfWashingMachines += element.finalPrice();
            }
            if (element instanceof Television) {
                sumOfTelevisions += element.finalPrice();
            }
        }
        logger.info("------------------------------------------------------------------------------");
        logger.info("La suma del precio de Electrodomésticos es: " + sumOfHouseholdAppliances);
        logger.info("La suma del precio de Lavadoras es: " + sumOfWashingMachines);
        logger.info("La suma del precio de Televisores es: "+ sumOfTelevisions);
    }
}

