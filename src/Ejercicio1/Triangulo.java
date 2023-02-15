package Ejercicio1;

public class Triangulo extends Geometria implements Coloreable{
    Double base;
    Double altura;

    Triangulo(Double base, Double altura){

    }
    @Override
    protected Double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    protected Double calcularPerimetro() {
        return 3 * base;
    }
}
