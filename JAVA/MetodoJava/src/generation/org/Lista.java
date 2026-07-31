package generation.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        //-----------------------------------
        //  Creamos listas
        List<String> lista = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();
        //-----------------------------------


        //-----------------------------------
        //Añádimos valores de la lista
        lista.add("Frida");
        lista.add("Tania");
        lista.add("Irán");
        lista.add("Daniela");
        lista.add("Tania"); //Permite duplicados
        //-----------------------------------


        // recorridos con colecciones: foreach
        System.out.println("---------------------------------------");
        System.out.println("RECOMERRMOS LISTA CON FOREACH E IMPRIMIMOMOS EL VALOR");
        for (String s : lista) {//almacenamos a nombres en s
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        //-----------------------------------

        System.out.println();

        //-----------------------------------
        System.out.println("---------------------------------------");
        System.out.println("IMPRIMIR DE FORMA CALSICA CON 'System.out.println(lista)'");
        // Impirmimos lsita
        System.out.println(lista);
        System.out.println("---------------------------------------");
        //-----------------------------------

        System.out.println();

        //Añadimos elementos a la lsita, y en la posicion 0 se guardara
        System.out.println("---------------------------------------");
        System.out.println("Añadimos elementos a la lsita, y en la posicion 0 se guardara");
        lista.add(0, "missa");
        System.out.println(lista);
        System.out.println("---------------------------------------");
        //-----------------------------------

        System.out.println();


        //-----------------------------------
        //Acceder a un indice especifico
        System.out.println("---------------------------------------");
        System.out.println("Acceder a un indice especifico = String nombre = lista.get(2) = Tania");
        String nombre = lista.get(2);
        System.out.println(nombre);
        System.out.println("---------------------------------------");
        System.out.println();


        //-----------------------------------
        //Eliminamos un elemento de la lista
        System.out.println("---------------------------------------");
        System.out.println("Eliminamos un elemento de la lista: lista.remove('Tania')");
//       lista.remove("Tania");
        System.out.println("---------------------------------------");

        System.out.println();

        System.out.println("---------------------------------------");
        System.out.println("Eliminando el elemento 'Daniela CON FOREACH (NO HACER)'");
        for (String karem : lista) {
            if (karem.equals("Daniela")) {
                lista.remove(karem);

            }
        }
        imprimirLista(lista);
        System.out.println("\n---------------------------------------");
        System.out.println("Eliminando el elemento 'Tania' con ITERADORES (FORMA CORRECTA");
        // Creamos Objeto de tipo iterator
        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("Tania")) {
                iterator.remove();
            }
        }

        imprimirLista(lista);
    }


    public static void imprimirLista(List<String> lista) {
        for (String s : lista) {//almacenamos a nombres en s
            System.out.print(s);
            System.out.print(", ");
        }
    }
}
