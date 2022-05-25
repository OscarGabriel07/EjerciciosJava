package com.sofka.ejercicio12;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        Scanner leer = new Scanner(System.in);
        logger.info("Por favor ingresa una palabra");
        String palabra1 = leer.nextLine();
        logger.info("Por favor ingresa otra palabra");
        String palabra2 = leer.nextLine();
        String diferenciasPalabra1ConRespectoPalabra2 = hallarDiferenciaPalabras(palabra1, palabra2);
        String diferenciasPalabra2ConRespectoPalabra1 = hallarDiferenciaPalabras(palabra2, palabra1);
        logger.info(diferenciasPalabra1ConRespectoPalabra2);
        logger.info(diferenciasPalabra2ConRespectoPalabra1);
    }

    public static String hallarDiferenciaPalabras(String comparador, String comparado){
        StringBuilder bld = new StringBuilder();
        String diferencias = "";
        String resultado = "";
        int contadorCaracteresIguales;
        for (int i = 0; i < comparador.length(); i++){
            contadorCaracteresIguales = 0;
            for (int j = 0; j < comparado.length(); j++){
                if(comparador.charAt(i) == comparado.charAt(j)){
                    contadorCaracteresIguales++;
                }
            }
            if(contadorCaracteresIguales == 0){
                bld.append(comparador.charAt(i));
            }
            diferencias = bld.toString();
        }
        if(comparador.equals(comparado)){
            resultado = "Las palabras son iguales";
        }else if(diferencias.equals("")){
            resultado = "La palabra " + comparador + " contiene todas las letras de la palabra "
                    + comparado + " aunque pueden estar en desorden, así que no hay diferencias";
        }else {
            resultado = "La diferencia de la palabra " + comparador + " con respecto a la palabra " + comparado
                    + " es: " + diferencias;
        }
        return resultado;
    }

}
