package com.sofka.ejercicio18;

import org.jboss.logging.Logger;

/**
 * Clase de prueba para el ejercicio 18 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {

        Serie serieOne = new Serie("Entrevías", 1, "Drama", "Carlos Gómez");
        Serie serieTwo = new Serie("Strangers Things", "Carolina Jiménez");
        Serie serieThree = new Serie();
        Serie serieFour = new Serie("¿Quién mató a Sara?", 4, "Inquietante", "Camila Sánchez");
        Serie serieFive = new Serie("Maverix", "Leonel Torres");
        Serie [] series = {serieOne, serieTwo, serieThree, serieFour, serieFive};

        Videojuego videoGameOne = new Videojuego("Battlefield 4", 8.6, "Deportes", "Campaña1");
        Videojuego videoGameTwo = new Videojuego("Destiny", 10);
        Videojuego videoGameThree = new Videojuego();
        Videojuego videoGameFour = new Videojuego("FIFA 22", 15, "Guerra", "Campaña5");
        Videojuego videoGameFive = new Videojuego("Need For Speed", 13);
        Videojuego[] videoGames = {videoGameOne, videoGameTwo, videoGameThree, videoGameFour, videoGameFive};

        series[0].deliver();
        series[3].deliver();
        series[4].deliver();
        videoGames[0].deliver();
        videoGames[1].deliver();
        videoGames[2].deliver();
        videoGames[4].deliver();

        int deliveredSeries = 0;
        int videoGamesDelivered = 0;

        for(Serie element: series){
            if(element.isDelivered()){
                deliveredSeries++;
            }
        }

        for(Videojuego element: videoGames){
            if(element.isDelivered()){
                videoGamesDelivered++;
            }
        }
        logger.info("Series entregadas : " + deliveredSeries
                + "\nVideojegos entregados: " + videoGamesDelivered);

        logger.info("----------------------------------------------------------");

        Serie seriesWithMoreSeasons = new Serie();
        seriesWithMoreSeasons.setNumberOfSeasons(0);
        for(int i = 0; i < series.length; i++){
            if(series[i].compareTo(seriesWithMoreSeasons) == 1){
                seriesWithMoreSeasons = series[i];
            }
        }
        logger.info("La serie con más temporadas es: \n" + seriesWithMoreSeasons.toString());

        logger.info("----------------------------------------------------------");

        Videojuego videoGamesWithMoreHours = new Videojuego();
        videoGamesWithMoreHours.setEstimatedHours(0);
        for(int i = 0; i < videoGames.length; i++){
            if(videoGames[i].compareTo(videoGamesWithMoreHours) == 1){
                videoGamesWithMoreHours = videoGames[i];
            }
        }
        logger.info("El videojuego con más horas estimadas es: \n" + videoGamesWithMoreHours.toString());
    }
}
