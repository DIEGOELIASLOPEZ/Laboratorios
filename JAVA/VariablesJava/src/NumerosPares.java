public class NumerosPares {

    public static void main(String[] args) {

        int contador = 1;
        final int LIMITE = 100;

        while (contador <= LIMITE){
            if (contador %2 == 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
