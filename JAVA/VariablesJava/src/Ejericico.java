import java.util.Scanner;

public class Ejericico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        double saldo = 20000;
        double deposito;
        double retiro;

        while (!salir) {
            System.out.println("-------------------------------------");
            System.out.println("Menu Opciones");
            System.out.println("1. Conultar Saldo: ");
            System.out.println("2. Depositar Dinero ");
            System.out.println("3. Retirar: ");
            System.out.println("4. Salir: ");
            System.out.println("-------------------------------------");
            System.out.print("Respuesta: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo Actual: " + saldo);
                    break;
                case 2:
                    System.out.println("Depositar Dinero");
                    System.out.print("Monto Depositado: ");
                    deposito = scanner.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("Saldo Actualizado " + saldo);

                    break;
                case 3:
                    System.out.println("Retiro de Dinero");
                    System.out.print("Monto a Retirar: ");
                    retiro = scanner.nextInt();

                    if (retiro < saldo) {
                        saldo = saldo - retiro;
                    } else {
                        System.out.println("No tienes esta cantidad");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del Sistema");
                    salir = true;
                    break;
                default:
                    break;

            }


        }
    }
}
