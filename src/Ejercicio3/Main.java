package Ejercicio3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numerosAleatorios = new int[100];

        numeroAleatorio(numerosAleatorios);
        System.out.println(Arrays.toString(numerosAleatorios));
    }

    private static void numeroAleatorio(int[] numerosAleatorios) {
        for (int i = 0; i < numerosAleatorios.length; i++){
            numerosAleatorios[i] = (int) (Math.random() * 100);
        }
    }
}
