package org.generatio.mx.figuras;

public class Figures {

    private double base;
    private double altura;
    private double radio;
    private static int contadorId = 0;
    private int idFigura;

    public Figures(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.idFigura = ++ contadorId;
    }

    public Figures(double radio) {
        this.radio = radio;
        this.idFigura = ++ contadorId;
    }

    // Metodos Getter

    public int getIdFigura() {
        return idFigura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getRadio() {
        return radio;
    }

    // Metodos Setter
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    //    Calcular Area Rectangulo
    public double areaCuadrada() {
        return base * altura;
    }

    public double areaTriangulo() {
        return (base * altura) / 2;
    }

    public double areaCirculo() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double area() {
        return 0;
    }


    public String toString() {
        if (radio > 0) {
            return "Radio del Ciruclo " + radio;
        } else {
            return "Base" + base + "\nAltura" + altura;
        }
    }


}


