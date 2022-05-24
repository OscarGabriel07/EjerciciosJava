package com.sofka.ejercicio8;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Logger logger = Logger.getLogger(com.sofka.ejercicio8.Main.class.getName());
        String diaDeLaSemana;
        logger.info("Por favor ingresa un día de la semana");
        diaDeLaSemana = leer.nextLine();
        indicarSiEsDiaLaboral(diaDeLaSemana);
    }

    public static void indicarSiEsDiaLaboral(String diaDeLaSemana){
        Logger logger = Logger.getLogger(com.sofka.ejercicio8.Main.class.getName());
        switch (diaDeLaSemana.toUpperCase()){
            case "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES":
                logger.info("Es un día laboral");
                break;
            case "SABADO", "DOMINGO":
                logger.info("NO es un día laboral");
                break;
            default:
                logger.info("No ingresaste un día válido");
        }
    }
}
