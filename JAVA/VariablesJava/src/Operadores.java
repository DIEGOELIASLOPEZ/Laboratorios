import java.util.Scanner;

public class Operadores {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int maximo = 3;
    String contrasenia = "contraseña";
    while (maximo > 0){
        System.out.print("Ingresa tu contraseña: ");

        String respuesta = scanner.nextLine();

        if (respuesta.equals(contrasenia)){
            System.out.println("Acceso");
            break;
        }
        else{
            System.out.println("Contraseña incorrecta");
            System.out.print("Numero de Intentos: " + (--maximo) + "\n");
        }
        System.out.println("Acceso Bloqueado");

    }
}
}
