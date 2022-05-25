package com.sofka.ejercicio15;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        mostrarMenuGestionCinematografica();
    }

    public static void mostrarMenuGestionCinematografica(){
        Logger logger = Logger.getLogger("logger");
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 8){
            logger.info("****** GESTIÓN CINEMATOGRÁFICA ********");
            logger.info("1-NUEVO ACTOR");
            logger.info("2-BUSCAR ACTOR");
            logger.info("3-ELIMINAR ACTOR");
            logger.info("4-MODIFICAR ACTOR");
            logger.info("5-VER TODOS LOS ACTORES");
            logger.info("6- VER PELICULAS DE LOS ACTORES");
            logger.info("7-VER CATEGORÍA DE LAS PELICULAS DE LOS ACTORES");
            logger.info("8-SALIR");
            logger.info("Por favor seleccione una opción");

            try{
                opcion = Integer.parseInt(leer.nextLine());
            }catch (Exception e){
                logger.info("Ingrese una opción válida del menú de opciones");
            }

            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    logger.info("¡Hasta pronto!");
                    break;
                default:
                    logger.info("Ingrese una opción válida del menú de opciones");
            }
        }
    }
}
