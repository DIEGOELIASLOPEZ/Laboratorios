package generation.org;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {

        Scanner sccaner = new Scanner(System.in);

        int[] numeros = new int[5];

        guardar(numeros);
        recorre(numeros);



    }

    public static void guardar(int[] numeros) {
        Scanner sccaner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(("Escribe un numero: "));
            int numero1 = sccaner.nextInt();
            numeros[i] = numero1;

        }
    }

    public static void recorre(int[] numeros) {

        int contadorPositivo = 0;
        int cotadorNegativo = 0;
        int contadorCero = 0;

        for (int numero : numeros) {
            if (numero < 0) {
                cotadorNegativo++;
            } else if (numero == 0) {
                contadorCero++;
            } else {
                contadorPositivo++;
            }
        }

        System.out.println("Tu arreglo tienes:");
        System.out.println("Postivos: " + contadorPositivo);
        System.out.println("Ceros: " + contadorCero);
        System.out.println("Negativos: " + cotadorNegativo);

    }

}


