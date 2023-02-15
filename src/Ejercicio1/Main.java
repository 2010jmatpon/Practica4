package Ejercicio1;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Geometria[] figuras = new Geometria[5];

        figuras[0] = new Circulo (2d);
        figuras[1] = new Cuadrado (4d);
        figuras[2] = new Triangulo (4.3d, 7.3);
        figuras[3] = new Cuadrado (2d);
        figuras[4] = new Circulo (3.7d);

        System.out.println(Arrays.toString(figuras));
        for (int i =0; i < figuras.length; i++){
            System.out.println(figuras[i].calcularArea());
            System.out.println(figuras[i].calcularPerimetro());
        }


    }
}