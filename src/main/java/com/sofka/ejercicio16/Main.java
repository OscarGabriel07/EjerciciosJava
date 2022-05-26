package com.sofka.ejercicio16;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    static Logger logger = Logger.getLogger("logger");
    public static void main(String[] args) {
        mostrarInformacionPersona1();
        mostrarInformacionPersona2();
        mostrarInformacionPersona3();
    }

    public static void mostrarInformacionPersona1(){
        Scanner leer = new Scanner(System.in);
        logger.info("Por favor ingresa tu nombre");
        String nombre = leer.nextLine();
        logger.info("Por favor ingresa tu edad");
        int edad = Integer.parseInt(leer.nextLine());
        logger.info("Por favor ingresa tu peso en kilogramos");
        double peso = Double.parseDouble(leer.nextLine());
        logger.info("Por favor ingresa tu altura en metros");
        double altura = Double.parseDouble(leer.nextLine());
        logger.info("Por favor ingresa tu sexo");
        char sexo = leer.next().charAt(0);
        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        imprimirObjetosPersona(persona);
    }
    public static void mostrarInformacionPersona2(){
        Scanner leer = new Scanner(System.in);
        logger.info("Por favor ingresa tu nombre");
        String nombre = leer.nextLine();
        logger.info("Por favor ingresa tu edad");
        int edad = Integer.parseInt(leer.nextLine());
        logger.info("Por favor ingresa tu sexo");
        char sexo = leer.next().charAt(0);
        Persona persona = new Persona(nombre, edad, sexo);
        imprimirObjetosPersona(persona);
    }
    public static void mostrarInformacionPersona3(){
        Persona persona = new Persona();
        persona.setNombre("Ana Pérez");
        persona.setEdad(24);
        persona.setSexo('M');
        persona.setPeso(55);
        persona.setAltura(1.61);
        imprimirObjetosPersona(persona);
    }

    public static void imprimirObjetosPersona(Persona persona){
        logger.info("----------------------------------------------");
        String mensajeAcercaDePeso = persona.mostrarMensajeAcercaDePeso();
        logger.info(mensajeAcercaDePeso);
        String esMayorDeEdad = persona.esMayorDeEdad() ? "Eres mayor de edad." : "No eres mayor de edad.";
        logger.info(esMayorDeEdad);
        String informacionPersona = persona.toString();
        logger.info(informacionPersona);
        logger.info("----------------------------------------------");
    }
}
