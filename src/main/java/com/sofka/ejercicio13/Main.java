package com.sofka.ejercicio13;

import org.jboss.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase de prueba para el ejercicio 13 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        showCurrentDateAndTime();
    }

    /**
     * Muestra la fecha y hora actual
     */
    public static void showCurrentDateAndTime(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        logger.info(formatter.format(date));
    }
}
