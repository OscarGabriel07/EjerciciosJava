package com.sofka.ejercicio16;

import java.util.Random;

public class Persona {
    private Random random = new Random();
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        comprobarSexo();
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularIMC(){
        if(this.peso == 0 || this.altura == 0){
            return 2;
        }else {
            double imc = (this.peso) / (Math.pow(this.altura, 2));
            if(imc < 20){
                return -1;
            }else if(imc >= 20 && imc <= 25){
                return 0;
            }else {
                return 1;
            }
        }
    }
    public String mostrarMensajeAcercaDePeso(){
        if(calcularIMC() == -1){
            return "Estás por debajo de tu peso ideal.";
        }else if(calcularIMC() == 0){
            return "Estás en tu peso ideal.";
        }else if(calcularIMC() == 1){
            return "Tienes sobrepeso.";
        }else {
            return "No has ingresado tu peso o tu estatura para poder procesar información acerca de tu IMC.";
        }
    }
    public boolean esMayorDeEdad(){
            return this.edad > 18;
    }
    private void comprobarSexo(){
        if (this.sexo != 'H' && this.sexo != 'M'){
            this.sexo = 'H';
        }
    }
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", Edad: " + this.edad + ", DNI: " + this.dni
                + ", Sexo: " + this.sexo + ", Peso: " + this.peso + ", Altura: " + this.altura;
    }
    public int generarDNI(){
        return this.random.nextInt(99999999 + 10000000) + 10000000;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
