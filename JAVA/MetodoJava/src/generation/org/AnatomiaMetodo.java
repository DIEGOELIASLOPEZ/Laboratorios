package generation.org;

public class AnatomiaMetodo {
    public static void main(String[] args) {
        saludar();

        System.out.println(suma(2,3));
    }

    public static void saludar() {
        System.out.println("Hola");
    }

    public static int suma(int a, int b) {
        return a + b;
    }

}


