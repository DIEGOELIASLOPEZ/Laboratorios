public class NuevaCuenta extends Cuenta {
    private String nombre;
    private String tipoTarjeta;
    private int monto;

    private int idCuenta;
    private static int contadorIdCuenta = 0;

    public NuevaCuenta(String nombre, String tipoTarjeta, int monto) {
        super(nombre, tipoTarjeta,monto);
        this.idCuenta = ++contadorIdCuenta;

    }



}
