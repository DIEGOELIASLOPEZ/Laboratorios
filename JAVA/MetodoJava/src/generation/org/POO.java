package generation.org;

import java.awt.*;
import java.util.Map;
import java.util.Set;

public class POO {

    //Objeto Estudiante
    private String nombre;
    private int edad;
    private int matricula;
    private Map<String, Map<String, String>> horario;
    //    Dia, Materia,horario
    private Map<String, Double> calificaciones;
    private double promedio;

    public POO(String nombre, int edad, Map<String, Map<String, String>> horario, Map<String, Double> calificaciones){
        this.nombre = nombre;
        this.edad = edad;
        this.horario = horario;
        this.calificaciones = calificaciones;

    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public Map<String, Map<String, String>> getHorario(){
        return this.horario;
    }
    public Map calificaciones(){
        return this.calificaciones;
    }
    public double getPromedio(){
        return this.promedio;
    }

}
