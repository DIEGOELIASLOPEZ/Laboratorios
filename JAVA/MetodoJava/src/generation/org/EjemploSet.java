package generation.org;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EjemploSet {

    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();
//        nombres.add("Missa");
//        nombres.add("Mario");
//        nombres.add("Steven");
//        nombres.add("Perucho");
//        nombres.add("Elios");
//
//        System.out.println(nombres);
//
//        int tamaño = nombres.size();
//        System.out.println("El tamaño es de " + tamaño);
//
//        boolean existe = nombres.contains("Elias");
//        System.out.println("Existe Elías: " + existe);
//
//        nombres.remove("Missa");
//        System.out.println("Elimando a 'Missa':  " + nombres);


        //Operacion con conjutnos
        Set<Integer> conjunto1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> conjunto2 = new HashSet<>(Arrays.asList(3, 4, 5));


        //Union de dos conjuntops
        Set<Integer> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);
        System.out.println("Union del conjunto 1 y 2: " + union);

        //Interseccion de dos conjuntos
        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);
        System.out.println("interseccion del conjunto 1 y 2: " + interseccion);





    }
}
