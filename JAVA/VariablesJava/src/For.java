import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Escribe la tabla de tu preferencia: ");
//        int valor = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int c = 1; c <= 10; c++) {

                System.out.println(i + " x " + c + " = " + (i*c));


            }
            System.out.println();

        }
    }
}
