package com.sofka.ejercicio16;

import org.jboss.logging.Logger;
import java.util.Random;

/**
 * Persona representará a una persona
 * En los ejemplos se usarán 3 personas
 *
 * @author Óscar Farfán - oscarfarfan92@gmail.com
 *
 * @version 1.0.0.000 28-05-2022
 */
public class Persona {
    public static final Logger logger = Logger.getLogger("logger");
    private Random random = new Random();
    private String name;
    private int age;
    private int dni;
    private char gender;
    private double weight;
    private double height;

    /**
     * Crea una persona con todos sus atributos inicializados por default
     * Se llama al método generateDNI() para generar identificación
     */
    public Persona(){
        this.name = "";
        this.age = 0;
        this.dni = generateDNI();
        this.gender = 'H';
        this.weight = 0;
        this.height = 0;
    }
    /**
     * Crea una persona que recibe como parámetros el nombre, la edad y el género
     * Se llama al método generateDNI() para generar identificación
     *
     * @param name nombre de la persona
     * @param age edad de la persona
     * @param gender género de la persona
     */
    public Persona(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.dni = generateDNI();
        this.gender = gender;
        checkGender();
        this.weight = 0;
        this.height = 0;
    }
    /**
     * Crea una persona que recibe como parámetros el nombre, la edad, el género, el peso y la altura
     * Se llama al método generateDNI() para generar identificación
     *
     * @param name nombre de la persona
     * @param age edad de la persona
     * @param gender género de persona
     * @param weight peso de la persona
     * @param height altura de la persona
     */
    public Persona(String name, int age, char gender, double weight, double height){
        this.name = name;
        this.age = age;
        this.dni = generateDNI();
        this.gender = gender;
        checkGender();
        this.weight = weight;
        this.height = height;
    }
    /**
     * Calcula el Índice de Masa Corporal de una persona
     *
     * @return devuelve el resultado de la fórmula matemática del Índice de Masa Corporal
     */
    public int calculateIMC(){
        if(this.weight == 0 || this.height == 0){
            return 2;
        }else {
            double imc = (this.weight) / (Math.pow(this.height, 2));
            if(imc < 20){
                return -1;
            }else if(imc >= 20 && imc <= 25){
                return 0;
            }else {
                return 1;
            }
        }
    }
    /**
     * Muestra por medio de un mensaje si la persona está por debajo de su peso ideal, en su peso ideal,
     * o en sobrepeso de acuerdo con el resultado de la fórmula matemática del Índice de Masa Corporal
     */
    public void showMessageAboutWeight(){
        if(calculateIMC() == -1){
            logger.info("Estás por debajo de tu peso ideal.");
        }else if(calculateIMC() == 0){
            logger.info("Estás en tu peso ideal.");
        }else if(calculateIMC() == 1){
            logger.info("Tienes sobrepeso.");
        }else {
            logger.info("No has ingresado tu peso o tu estatura para poder procesar información acerca de tu IMC.");
        }
    }
    /**
     * Retorna verdadero si la persona es mayor de edad, sino retorna falso
     *
     * @return devuelve verdadero si la persona es mayor de edad, sino retorna falso
     */
    public boolean isOfLegalAge(){
            return this.age > 18;
    }
    /**
     * Valida si el género es H (Hombre) o M (Mujer). Si no es ninguno de los dos asigna H
     * por defecto al género de la persona
     */
    private void checkGender(){
        if (this.gender != 'H' && this.gender != 'M'){
            this.gender = 'H';
        }
    }
    /**
     * Se sobreescribe el método toString para mostrar la información de todos los atributos de la persona
     *
     * @return devuelve la información de todos los atributos de la persona
     */
    @Override
    public String toString(){
        return "Nombre: " + this.name + ", Edad: " + this.age + ", DNI: " + this.dni
                + ", Sexo: " + this.gender + ", Peso: " + this.weight + ", Altura: " + this.height;
    }
    /**
     * Genera un identificador de 8 dígitos de manera aleatoria
     *
     * @return devuelve el identificador de 8 dígitos de manera aleatoria
     */
    public int generateDNI(){
        return this.random.nextInt(99999999 + 10000000) + 10000000;
    }
    /**
     * Modifica el nombre de la persona
     *
     * @param name recibe el nuevo nombre de la persona
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Modifica la edad de la persona
     *
     * @param age recibe la nueva edad de la persona
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Modifica el sexo de la persona
     *
     * @param gender recibe el nuevo sexo de la persona
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    /**
     * Modifica el peso de la persona
     *
     * @param weight recibe el nuevo peso de la persona
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * Modifica la altura de la persona
     *
     * @param height recibe la nueva altura de la persona
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
