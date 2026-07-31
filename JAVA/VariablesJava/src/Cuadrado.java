public class Cuadrado {

    public static void main(String[] args) {
        int numero = 20;


        for (int i = 0; i < numero; i++) {
            System.out.println();
            for (int j = 0; j < numero; j++) {
                if ((i >= 1 && i< numero-1) && ( j >=1 && j < numero-1)){
                    System.out.print(" ");

                }else {
                    System.out.print("x");
                }


            }

        }

    }
}
