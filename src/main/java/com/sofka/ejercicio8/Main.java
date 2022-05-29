package com.sofka.ejercicio8;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 8 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String weekday;
        logger.info("Por favor ingresa un día de la semana");
        weekday = read.nextLine();
        sayIfItIsAWorkingDay(weekday);
    }
    /**
     * Indica si el día de la semana ingresado es laboral o no
     *
     * @param weekday recibe el día de la semana que se va a evaluar
     */
    public static void sayIfItIsAWorkingDay(String weekday){
        switch (weekday.toLowerCase()){
            case "lunes", "martes", "miercoles", "jueves", "viernes":
                logger.info(weekday + " es un día laboral");
                break;
            case "sabado", "domingo":
                logger.info(weekday + " NO es un día laboral");
                break;
            default:
                logger.info("No ingresaste un día válido");
        }
    }
}
