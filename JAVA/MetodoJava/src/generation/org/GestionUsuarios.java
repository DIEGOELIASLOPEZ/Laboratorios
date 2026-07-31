package generation.org;

import java.util. *;
import java.util.HashSet;
import java.util.Set;

public class GestionUsuarios {
    public static void main(String[] args) {
        Set<String> usuarios = new HashSet<>(Arrays.asList("Milett", "Brandon", "Iran", "Elios, Alma", "Missa"));
        Set<String> usuariosPremium = new HashSet<>(Arrays.asList("Preucho", "Mario", "Steven", "Eva", "Missa"));

        // Union de usuariosPremium y normales
        System.out.println("Union");
        Set<String> union = new HashSet<>(usuarios);
        union.addAll(usuariosPremium);
        System.out.println(union);

        System.out.println();

        // Intersección, solo los que son usuarios y usarios Premium
        System.out.println("Insersion");
        Set<String> Interseccion = new HashSet<>(usuarios);
        Interseccion.retainAll(usuariosPremium);
        System.out.println(Interseccion);





    }
}
