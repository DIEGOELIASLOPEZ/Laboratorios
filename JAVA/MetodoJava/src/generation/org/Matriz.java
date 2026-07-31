package generation.org;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[2][2];

        guiardarMatriz(matriz);
        imprimirMatriz(matriz);

    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] guiardarMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Intoduce los elementos de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Posicion [" + i + "] " + "[" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }


}
