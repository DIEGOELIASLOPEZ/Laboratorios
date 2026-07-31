public class cadenaInversa {

    public static void main(String[] args) {
        String cadena = "cadena".toLowerCase();

        String inverso = "";

        int longitud = cadena.length()-1; //5
        System.out.println(cadena.charAt(longitud));

        for (int i = longitud; i >= 0; i--) {
            inverso += cadena.charAt(i);

        }
        System.out.println(cadena);
        System.out.println(inverso);

        
    }
}
