import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(100);
//        System.out.println(numero);


        int contadorIntentos = 0;
        boolean salir = false;
        int numeroUsuario = 0;
        final int MAXIMO_INTENTOS = 3;

        while (contadorIntentos < MAXIMO_INTENTOS) {

            System.out.println("-------------------------------");
            System.out.print("Escribe un numero: ");
            numeroUsuario = scanner.nextInt();
            System.out.println("-------------------------------");

            if (numeroUsuario >= 0 && numeroUsuario <= 100) {
                if (numeroUsuario == numero) {
                    System.out.println("Correcto");
                    System.out.println("El numero es " + numero);
                    contadorIntentos++;
                    break;

                } else if (numeroUsuario > numero) {
                    System.out.println("Incorrecto");
                    System.out.println("Tu numero esta debajo de " + numeroUsuario);

                } else if (numeroUsuario < numero) {
                    System.out.println("Incorrecto");
                    System.out.println("Tu numero esta por arriba de " + numeroUsuario);

                }
                contadorIntentos++;
            }else {
                System.out.println("El numero esta fuera del rango");
//                contadorIntentos++;
            }

        }

        if (contadorIntentos == MAXIMO_INTENTOS && numeroUsuario != numero) {
            System.out.println("Se han terminado tus intentos intenta de nuevo");
            System.out.println(numero);
        } else {
            System.out.println("Numero de Intentos realizados: " + (contadorIntentos));
        }


    }
}
