package com.sofka.ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        String fechaHoraActual = consultarFechaHoraActual();
        logger.info(fechaHoraActual);
    }

    public static String consultarFechaHoraActual(){
        Date fecha = new Date();
        SimpleDateFormat formatear = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return formatear.format(fecha);
    }
}
