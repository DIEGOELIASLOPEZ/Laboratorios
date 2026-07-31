package org.generatio.mx.employee;

public class Employee {

    //Clase MOLDE

    //  1. Atributos
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private String position;

    private int idEmpleado;
    private static int contadorEmpleado = 0;

//   2. Consutructores

    public Employee(String firstName, String lastName, int age, double salary, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.position = position;
        this.idEmpleado = ++Employee.contadorEmpleado;
    }


    //   3. Getter Setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    //   4. Metodos
    // -- Obtner  el nombre completo
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // -- Calcular la edad de juvilacion(65){
    public int getYearsRetirement() {
        final int retirementAge = 65;

        if (this.age >= retirementAge) {
            return 0;
        } else {
            int retirementYear = retirementAge - this.age;
            return retirementYear;
        }

    }


    // Muestra la posicion del empleado
    public String getPositionEmpoyed() {
        return getFullName() + " is the " + this.position;
    }

    // Aumentar Saliario
    public double incrementSalary(double percent) {
        this.salary += this.salary * (percent / 100);
        return salary;
    }

//   5. toString()


    @Override
    public String toString() {
        return "Employee: " + this.idEmpleado + "\n" +
                "firstName: " + firstName + "\n" +
                "astName: " + lastName + "\n" +
                "age: " + age + "\n" +
                "salary: " + salary + "\n" +
                "position: " + position + "\n";
    }

    public static void main(String[] args) {

    }
}
