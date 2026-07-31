package generation.org;

import java.util.HashMap;
import java.util.Map;

public class Estudiante {

    // ==========================
    // Atributos
    // ==========================
    private String nombre;
    private int edad;
    private int matricula;
    private Map<String, Map<String, String>> horario;
    // Día -> (Materia -> Horario)
    private Map<String, Double> calificaciones;
    private double promedio;

    // ==========================
    // Constructor
    // ==========================
    public Estudiante(String nombre, int edad,
                      Map<String, Map<String, String>> horario,
                      Map<String, Double> calificaciones) {

        this.nombre = nombre;
        this.edad = edad;
        this.horario = horario;
        this.calificaciones = calificaciones;
    }

    // ==========================
    // Getters
    // ==========================
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Map<String, Map<String, String>> getHorario() {
        return horario;
    }

    public Map<String, Double> getCalificaciones() {
        return calificaciones;
    }

    public double getPromedio() {
        return promedio;
    }

    // ==========================
    // Setters
    // ==========================
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHorario(Map<String, Map<String, String>> horario) {
        this.horario = horario;
    }

    public void setCalificaciones(Map<String, Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    // ==========================
    // Métodos
    // ==========================

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Promedio: " + promedio());

    }

    public double promedio(){
        double promedio = 0;
        for (Double calificacion: this.calificaciones.values()){
            promedio = promedio + calificacion;
        }
        promedio = promedio / calificaciones.values().toArray().length;
        return promedio;
    }

    public void mostrarHorario(){
        for (Map.Entry<String, Map<String, String>> dia : horario.entrySet()) {
            System.out.println(dia.getKey().toUpperCase());
            for (Map.Entry<String, String> materia: dia.getValue().entrySet()){
                System.out.println(materia.getKey() + " - " + materia.getValue());
            }
            System.out.println();
        }
    }



    // ==========================
    // Main
    // ==========================
    public static void main(String[] args) {

        // Horario
        Map<String, Map<String, String>> horario = new HashMap<>();

        Map<String, String> impar = new HashMap<>();
        impar.put("GEOMETRIA ANALITICA", "8:30 - 10:00");
        impar.put("INTROD. A LA INGENIER. COMPUTACION", "10:00 - 11:30");
        impar.put("COMPUTADORAS Y PROGRAMACION", "7:00 - 9:00");

        int[] numeros = {10,20,30};

        Map<String, String> par = new HashMap<>();
        par.put("CALCULO DIFERENCIAL E INTEGRAL", "9:00 - 11:20");
        par.put("ALGEBRA", "11:00 - 13:00");

        horario.put("Lunes", impar);
        horario.put("Martes", par);
        horario.put("Miércoles", impar);
        horario.put("Jueves", par);
        horario.put("Viernes", impar);

        // Calificaciones
        Map<String, Double> calificaciones = new HashMap<>();
        calificaciones.put("GEOMETRIA ANALITICA", 7.0);
        calificaciones.put("INTROD. A LA INGENIER. COMPUTACION", 10.0);
        calificaciones.put("COMPUTADORAS Y PROGRAMACION", 9.5);
        calificaciones.put("CALCULO DIFERENCIAL E INTEGRAL", 9.5);
        calificaciones.put("ALGEBRA", 10.0);

        // Crear objeto
        Estudiante elias = new Estudiante(
                "Elias",
                23,
                horario,
                calificaciones
        );

        elias.promedio();
        elias.mostrarHorario();

        System.out.println(elias);

    }
}