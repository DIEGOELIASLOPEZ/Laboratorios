package generation.org;

import java.util.*;

public class Listas2 {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Poncho de Nigris");
        nombres.add("Frijolit");
        nombres.add("Bichi");
        nombres.add("Goya");
        nombres.add("Frijolito");

        System.out.println(nombres);

        Set<String> nombres2 = new HashSet<>();

        Map<String, Integer> gatitos = new HashMap<>();
        gatitos.put("Felix", 12);
        gatitos.put("Garfield", 10);

        String nombrefGatito = "Felix";
//        System.out.println(gatitos.get("Felix"));

        System.out.println("Nombre: " + nombrefGatito + "\nEdad:" + gatitos.get(nombrefGatito));

    }
}
