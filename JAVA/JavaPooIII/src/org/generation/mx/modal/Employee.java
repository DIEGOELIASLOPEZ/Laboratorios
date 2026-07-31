package org.generation.mx.modal;

public class Employee {

    private Long idEmpoye;
    private String fullName;
    private String position;
    private double salary;


    private static int contadorId = 0;

    public Employee(long idEmpoye, String fullName, String position, double salary) {
        this.idEmpoye = idEmpoye;
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
    }


    public Long getIdEmpoye() {
        return idEmpoye;
    }

    public void setIdEmpoye(Long idEmpoye) {
        this.idEmpoye = idEmpoye;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Employee.contadorId = contadorId;
    }

    @Override
    public String toString() {
        return "id: " + idEmpoye +
                "\nname: " + fullName +
                "\nPosition: " + position +
                "\nSalary: " + salary;
    }
}
