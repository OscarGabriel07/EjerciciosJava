package com.sofka.ejercicio15;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 15 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        showTheFilmManagementMenu();
    }

    /**
     * Muestra el menú de Gestión Cinematográfica
     */
    public static void showTheFilmManagementMenu(){
        Scanner read = new Scanner(System.in);
        int option = 0;
        while (option != 8){
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
                option = Integer.parseInt(read.nextLine());
            }catch (Exception e){
                logger.info("Ingrese una opción válida del menú de opciones");
            }

            switch (option){
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
