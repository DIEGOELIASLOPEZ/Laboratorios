package org.generatio.mx.figuras;

public class Circulo extends Figures {
    private double radio;
    private int idFigura;

    public Circulo(double radio) {
        super(radio);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadio(), 2);
    }

    public String toString(){
        return  + getIdFigura() + "\nradio: " + radio;
    }

}

