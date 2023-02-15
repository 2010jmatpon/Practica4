package Ejercicio1;

public class Cuadrado extends Geometria implements Coloreable {
    Double lado;

    Cuadrado (Double lado){

    }

    @Override
    protected Double calcularArea() {
        return lado * lado;
    }

    @Override
    protected Double calcularPerimetro() {
        return lado * 4;
    }
}
