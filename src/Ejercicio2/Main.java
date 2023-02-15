package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        String a = "Vamos a hacer un TikTok";
        int i = 0;
        contarPalabras(a, i);

    }

    static void contarPalabras(String a, int i) {
        i = 0;
        for (int b = 0; b < 5; b++){
            while (a == " "){
                i++;
            }
        }
        System.out.println("El texto tiene " + i + " palabras.");
    }
}
