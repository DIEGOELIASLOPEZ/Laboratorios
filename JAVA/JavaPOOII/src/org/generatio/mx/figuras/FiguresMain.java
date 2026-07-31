package org.generatio.mx.figuras;

public class FiguresMain {

    public static void main(String[] args) {
        Figures circulo = new Figures(5);
        Figures triangulo = new Figures(5,12);
        Figures rectangulo = new Figures(5,23);
        System.out.printf("%.2f%n", circulo.areaCirculo());
        System.out.printf("%.2f%n", triangulo.areaTriangulo());
        System.out.printf("%.2f%n", rectangulo.areaCuadrada());

        System.out.println(circulo.toString());;
        System.out.println(triangulo.toString());;
        System.out.println(rectangulo.toString());;

//
    }
}
