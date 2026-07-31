package generation.org;

import java.util.Scanner;


public class CuenaBancaria {

    private String nombreTitular;
    private double saldo;
    private String tipoCuenta;

    public CuenaBancaria(String nombreTitular, double saldo, String tipoCuenta) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }


    //Metodos Getter
    public String getNombreTitular() {
        return this.nombreTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    //Metodos Setter
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    // Mostrar Informacion - sobreescritura del Metodo ToString()
    @Override
    public String toString() {
        return "Nombre del titular: " + nombreTitular +
                "\nSaldo Actual: " + String.format("%.2f", saldo) +
                "\nTipo de Cuenta: " + tipoCuenta;
    }


    public void depositarSaldo(double deposito) {
        setSaldo(this.saldo + deposito);
    }

    public void retirarDinero(double retiro) {
        if (retiro > this.saldo && retiro>0) {
            System.out.println("Cantidad invalida");
        } else {
            setSaldo(this.saldo - retiro);
        }
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean salir = false;


        while (!salir) {
            System.out.println("----------------------------");
            System.out.println("1 Mostrar Informacion ");
            System.out.println("2. Consular Saldo ");
            System.out.println("3. Depositar Dinero");
            System.out.println("4. Retirar dinero  Dinero");
            System.out.println("5. SALIR");
            System.out.print("- ");
            System.out.println("----------------------------");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println(toString());
                    break;
                case 2:
                    System.out.println("Saldo Actual $" + getSaldo() + " pesos");
                    break;
                case 3:
                    System.out.print("Ingresa el monto a depositar: ");
                    double deposito = Double.parseDouble(scanner.nextLine());
                    depositarSaldo(deposito);
                    System.out.println("¡Depósito realizado con éxito!");
                    break;
                case 4:
                    System.out.print("Ingresa el monto a retirar: ");
                    double retiro = Double.parseDouble(scanner.nextLine());
                    retirarDinero(retiro);

                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    salir = true;
                default:
                    System.out.println("Opcion no valia");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double saldo;
        String tipoCuenta = "";
        boolean salir = false;

        System.out.println("Regitro - Cuenta Bancaria");
        System.out.print("Escribe tu nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Saldo Inicial: ");
        saldo = Double.parseDouble(scanner.nextLine());

        while (!salir) {
            System.out.print("Tipo de Cuenta (credito/debito)");
            tipoCuenta = scanner.nextLine();
            tipoCuenta = tipoCuenta.toLowerCase();
            if (tipoCuenta.equals("debito") || tipoCuenta.equals("credito")) {
                salir = true;
            } else {
                System.out.println("Tipo de Cuenta inbcorrecta");
            }
        }


        CuenaBancaria usuario1 = new CuenaBancaria(nombre, saldo, tipoCuenta);
        usuario1.menu();


    }


}
