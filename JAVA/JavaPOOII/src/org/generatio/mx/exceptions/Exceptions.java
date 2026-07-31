package org.generatio.mx.exceptions;

public class Exceptions {

    public static void main(String[] args) {
        int[] numeros = {1,2,3,4};

        for (int i = 0; i <= numeros.length; i++) {
            try {
                System.out.println(numeros[i]);
            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Error: índice fuera del arreglo.");
                System.out.println(e);
            }
        }
    }
}