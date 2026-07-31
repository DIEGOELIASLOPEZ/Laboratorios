package org.generatio.mx.figuras;

public class Rectangulo extends Figures {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public double area() {
        return base * altura;
    }

    public String toString(){
        return "base: " + base + "\n" +
                "altura: " + altura;
    }

}

