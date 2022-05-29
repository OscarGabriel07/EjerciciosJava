package com.sofka.ejercicio16;

import org.jboss.logging.Logger;
import java.util.Scanner;

/**
 * Clase de prueba para el ejercicio 16 del taller de Java
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Main {
    public static final Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        showInformationPersonOne();
        showInformationPersonTwo();
        showInformationPersonThree();
    }
    /**
     * Captura la información de la primera persona y la muestra por consola
     */
    public static void showInformationPersonOne(){
        Scanner read = new Scanner(System.in);
        logger.info("Por favor ingresa tu nombre");
        String name = read.nextLine();
        logger.info("Por favor ingresa tu edad");
        int age = Integer.parseInt(read.nextLine());
        logger.info("Por favor ingresa tu peso en kilogramos");
        double weight = Double.parseDouble(read.nextLine());
        logger.info("Por favor ingresa tu altura en metros");
        double height = Double.parseDouble(read.nextLine());
        logger.info("Por favor ingresa tu sexo");
        char gender = read.next().charAt(0);
        Persona person = new Persona(name, age, gender, weight, height);
        printPersonObjects(person);
    }
    /**
     * Captura la información de la segunda persona y la muestra por consola
     */
    public static void showInformationPersonTwo(){
        Scanner read = new Scanner(System.in);
        logger.info("Por favor ingresa tu nombre");
        String name = read.nextLine();
        logger.info("Por favor ingresa tu edad");
        int age = Integer.parseInt(read.nextLine());
        logger.info("Por favor ingresa tu sexo");
        char gender = read.next().charAt(0);
        Persona person = new Persona(name, age, gender);
        printPersonObjects(person);
    }
    /**
     * Captura la información de la tercera persona y la muestra por consola
     */
    public static void showInformationPersonThree(){
        Persona person = new Persona();
        person.setName("Ana Pérez");
        person.setAge(24);
        person.setGender('M');
        person.setWeight(55);
        person.setHeight(1.61);
        printPersonObjects(person);
    }
    /**
     * Muestra por consola mensaje acerca del peso de la persona, información de si es mayor de edad o no y
     * por último la información personal de la persona
     *
     * @param person persona a la que se le mostrará por consola la información personal
     */
    public static void printPersonObjects(Persona person){
        logger.info("----------------------------------------------");
        person.showMessageAboutWeight();
        String isOfLegalAge = person.isOfLegalAge() ? "Eres mayor de edad." : "No eres mayor de edad.";
        logger.info(isOfLegalAge);
        String personalInformation = person.toString();
        logger.info(personalInformation);
        logger.info("----------------------------------------------");
    }
}
