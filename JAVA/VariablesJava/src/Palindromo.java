public class Palindromo {

    public static void main(String[] args) {
        String cadena = "Missael";
        cadena = cadena.replace(" ", "").toLowerCase();

        String palindromo = "";
        int longitud = cadena.length();


//        for (int i = cadena.length()-1; i >=0; i--) {
//            palindromo = palindromo  + (cadena.charAt(i));
//
//        };

        boolean espalindromo = true;
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != (cadena.charAt(longitud - i- 1))) {
                espalindromo = false;
            }

        }
        if (espalindromo) {
            System.out.println(cadena + ". Es un palindromo");
        } else {
            System.out.println(cadena + ". No es palindormo");
        }


        if (cadena.equals(palindromo)) {
            System.out.println("Es palindormo");
        }


    }
}
