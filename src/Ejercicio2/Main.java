package Ejercicio2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String texto = "Si esto no es Futbol el futbol donde esta";
        // Convierto el texto a minúsculas
        texto = texto.toLowerCase();
        // Hago un array donde almacenare las palabras del texto
        String[] palabras = new String[texto.length()];
        // Inicializo la variable contador para contar las palabras diferentes
        int contador = 0;
        //Con el metodo split lo que indico es que se debe separar el texto cada vez que haya un espacio
        String[] separador = texto.split(" ");

        for (String palabra : separador) {
            if (!contiene(palabras, palabra)) {
                palabras[contador] = palabra;
                contador++;
            }
        }
        System.out.println("El número de palabras diferentes es: " + contador);
    }
    public static boolean contiene(String[] separador, String palabra) {
        for (String elemento : separador) {
            if (elemento != null && elemento.equals(palabra)) {
                return true;
            }
        }
        return false;
    }
}

