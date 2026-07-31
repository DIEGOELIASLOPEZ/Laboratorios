import java.util.Scanner;

public class Cuenta {

    private String nombre;
    private String tipoTarjeta;
    private int monto;

    private int idCuenta;


    public Cuenta(String nombre, String tipoTarjeta, int monto) {
        this.nombre = nombre;
        this.tipoTarjeta = tipoTarjeta;
        this.monto = monto;

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipoTarjeta() {
        return this.tipoTarjeta;
    }

    public int getMonto() {
        return this.monto;
    }

    public int getIdCuenta() {
        return this.monto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }


    public void menu() {
        int opcion = 0;
        System.out.println("Menu de Operaciones");
        System.out.println("(1) Mostrar Datos");
        System.out.println("(2) Saldo disponible");
        System.out.println("(3) Depositar");
        System.out.println("(4) Retirar");
        System.out.println("(5) Salir");

        switch (opcion) {
            case 1:
                System.out.println("Mostar Datos");
                break;
            case 2:
                System.out.println("Mostar Datos");
                break;
            case 3:
                System.out.println("Mostar Datos");
                break;
            case 4:
                System.out.println("Mostar Datos");
                break;
            case 5:
                System.out.println("Mostar Datos");
                break;
            default:
                System.out.println("Opcion NO valida");
                break;
        }
    }
}
