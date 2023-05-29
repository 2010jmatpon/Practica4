package Ejercicio3;

import java.util.Arrays;

public class Ej3 {
    public static void main(String[] args) {

        int [] numAleatorios = new int [100];
        numerosAleatorios(numAleatorios, 1000, 1);
        System.out.println("El array de numeros aleatorios es: " + Arrays.toString(numAleatorios));
        System.out.println("El numero mayor es: " + numeroMayor(numAleatorios));
        System.out.println("El numero menor es: " + numeroMenor(numAleatorios));
        System.out.println("La suma de los numeros es: " + sumaArray(numAleatorios));
        System.out.println("La media de los numeros es: " + mediaArray(numAleatorios));
        System.out.println("El array tras sustituir una posición es: " + Arrays.toString(sustituirElemento(numAleatorios, 1, 2)));
    }

    //El metodo de numeros aleatorios cogera el array declarado previamente y dandole unos límites para que esos números aleatorios estén entre esos límites
    //Bucle for para que recorra el array correctamente y la operación para multiplicar el numero aleatorio por los límites para que los números
    //queden dentro de ellos.
    public static int[] numerosAleatorios(int[] numAleatorios, int limiteMax, int limiteMin){
        for (int i = 0; i < numAleatorios.length; i++) {
            int numero = (int) ((Math.random() * (limiteMax - limiteMin)) + limiteMin);
            numAleatorios[i] = numero;
        }
        return numAleatorios;
    }


    public static int numeroMayor (int[] numAleatorios){
        int mayor = 0;
        for (int i = 0; i < numAleatorios.length; i++) {
            if (numAleatorios[i] > mayor){
                mayor = numAleatorios[i];
            }
        }
        return mayor;
    }

    public static int numeroMenor (int[] numAleatorios){
        int menor = 0;
        for (int i = 0; i > numAleatorios.length; i--) {
            if (numAleatorios[i] < menor){
                menor = numAleatorios[i];
            }
        }
        return menor;
    }

    public static int sumaArray (int[] numAleatorios){
        int suma = 0;
        for (int i = 0; i < numAleatorios.length; i++) {
            suma = suma + numAleatorios[i];
        }

        return suma;
    }

    public static int mediaArray (int[] numAleatorios){
        int suma = 0;
        for (int i = 0; i < numAleatorios.length; i++) {
            suma = suma + numAleatorios[i];
        }
        return suma / numAleatorios.length;
    }

    public static int[] sustituirElemento (int[] numAleatorios, int pos, int elemento){
        int[] copiaNumAleatorios = numAleatorios.clone();
        for (int i = 0; i < copiaNumAleatorios.length; i++) {
            if(copiaNumAleatorios[i] == copiaNumAleatorios[pos - 1]){
                copiaNumAleatorios[i] = elemento;
            }
        }

        return copiaNumAleatorios;
    }

}
