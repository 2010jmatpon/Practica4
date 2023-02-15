package Ejercicio1;

public class Circulo extends Geometria implements Coloreable{
    Double radio;

    Circulo (Double radio){

    }
    @Override
    protected Double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    protected Double calcularPerimetro() {
        return Math.PI * Math.pow(radio, 2);
    }
}
