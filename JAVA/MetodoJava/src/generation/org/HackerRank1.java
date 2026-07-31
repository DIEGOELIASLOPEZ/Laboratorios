import java.util.Scanner;

public class HackerRank1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Número de consultas (q)

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int acumulado = a; // Empezamos la serie con 'a'
            int factor = 1;    // Representa las potencias de 2 (1, 2, 4, 8, ...)

            for (int j = 0; j < n; j++) {
                // Sumamos el término actual
                acumulado = acumulado + (factor * b);

                // Imprimimos el resultado seguido de un espacio
                System.out.print(acumulado + " ");

                // Duplicamos el factor para el siguiente paso (2^0 -> 2^1 -> 2^2...)
                factor = factor * 2;
            }

            // Salto de línea al terminar cada consulta
            System.out.println();
        }

        in.close();
    }
}