package generation.org;

public class PerfilesCH69 {

    public static void main(String[] args) {

    }

    public static void mostrarPerfil(
            String nombre,
            String rol,
            String tecnologia,
            int mesesExperiencia

    ) {
        System.out.println("El perfil Tecnologico es");
        System.out.println("Nombre: " + nombre);
        System.out.println("Rol: " + rol);
        System.out.println("Tecnologia que domina:" + tecnologia);

        mostrarNivel(mesesExperiencia);
    }

    public static void mostrarNivel(int meses){
        if (meses >= 1 && meses<=24 ) {
            System.out.println("Junior");
        }else if(meses > 24 && meses<=48 ){
            System.out.println("Middle");
        }else {
            System.out.println("Senior");
        }
    }
}
