import java.util.*;

public class ArrListsss {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 4,29));

        numeros.add(5);

        Iterator<Integer> iterador = numeros.iterator();

        while (iterador.hasNext()){
            int i = iterador.next();
            if(i == 29){
                iterador.remove();
            }
        }

        System.out.println(numeros);

    }
}
