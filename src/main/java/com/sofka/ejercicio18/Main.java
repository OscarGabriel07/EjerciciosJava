package com.sofka.ejercicio18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");

        Serie serie1 = new Serie("Entrevías", 1, "Drama", "Carlos Gómez");
        Serie serie2 = new Serie("Strangers Things", "Carolina Jiménez");
        Serie serie3 = new Serie();
        Serie serie4 = new Serie("¿Quién mató a Sara?", 4, "Inquietante", "Camila Sánchez");
        Serie serie5 = new Serie("Maverix", "Leonel Torres");
        Serie [] series = {serie1, serie2, serie3, serie4, serie5};

        Videojuego videojuego1 = new Videojuego("Battlefield 4", 8.6, "Deportes", "Campaña1");
        Videojuego videojuego2 = new Videojuego("Destiny", 10);
        Videojuego videojuego3 = new Videojuego();
        Videojuego videojuego4 = new Videojuego("FIFA 22", 15, "Guerra", "Campaña5");
        Videojuego videojuego5 = new Videojuego("Need For Speed", 13);
        Videojuego[] videojuegos = {videojuego1, videojuego2, videojuego3, videojuego4, videojuego5};

        series[0].entregar();
        series[3].entregar();
        series[4].entregar();
        videojuegos[0].entregar();
        videojuegos[1].entregar();
        videojuegos[2].entregar();
        videojuegos[4].entregar();

        int seriesEntregadas = 0;
        int videojuegosEntregados = 0;

        for(Serie elemento: series){
            if(elemento.estaEntregado()){
                seriesEntregadas++;
            }
        }

        for(Videojuego elemento: videojuegos){
            if(elemento.estaEntregado()){
                videojuegosEntregados++;
            }
        }

        String seriesYVideojuegosEntregados = "Series entregadas : " + seriesEntregadas
                + "\nVideojegos entregados: " + videojuegosEntregados;
        logger.info(seriesYVideojuegosEntregados);

        logger.info("----------------------------------------------------------");

        Serie serieMasTemporadas = new Serie();
        serieMasTemporadas.setCantidadTemporadas(0);
        for(int i = 0; i < series.length; i++){
            if(series[i].compareTo(serieMasTemporadas) == 1){
                serieMasTemporadas = series[i];
            }
        }
        String impresionSerieMasTemporadas = "La serie con más temporadas es: \n" + serieMasTemporadas.toString();
        logger.info(impresionSerieMasTemporadas);

        logger.info("----------------------------------------------------------");

        Videojuego videojuegoMasHoras = new Videojuego();
        videojuegoMasHoras.setHorasEstimadas(0);
        for(int i = 0; i < videojuegos.length; i++){
            if(videojuegos[i].compareTo(videojuegoMasHoras) == 1){
                videojuegoMasHoras = videojuegos[i];
            }
        }
        String impresionVideojuegosMasHoras = "El videojuego con más horas estimadas es: \n" + videojuegoMasHoras.toString();
        logger.info(impresionVideojuegosMasHoras);

    }
}
