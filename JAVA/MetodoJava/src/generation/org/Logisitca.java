package generation.org;

public class Logisitca {

    /*Una Empresa de Logistica necesita estimar: distancia, tiempo y costo
    de enviar una unidad combustible antes
    Nota: Cada Calculo debe reutilizarse en diferentes modulos*/

    public static void main(String[] args) {
        double distanciaInicio = 250;
        double distanciaFin = 350;
        double velocidad = 100;
        double costoCombustible = 150;
        double litrosCombustible = 20;




        double distancia = CalcularDistancia(distanciaInicio, distanciaFin);
        double tiempo = calcularTiempo(distancia, velocidad);
        double costo = caluclarCombustible(costoCombustible, litrosCombustible);
        mostarDatos(distancia, tiempo, costo);


    }


    public static double CalcularDistancia(double inicio, double fin) {
        return inicio + fin;
    }

    public static double calcularTiempo(double distancia, double velocidad) {
        if (velocidad <= 0) {
            return 0;
        } else {
            return distancia / velocidad;
        }
    }

    public static double caluclarCombustible(double costoCombustible, double litrosCombustible) {
        return costoCombustible * litrosCombustible;
    }

    public static void mostarDatos(double distancia, double tiempo, double costo) {

        System.out.printf("Distancia: %.2f km\n", distancia);
        System.out.printf("Tiempo: %.2f horas\n", tiempo);
        System.out.printf("Costo: $%.2f pesos\n", costo);
    }
}
