package org.generation.mx.modal.developer;

import org.generation.mx.modal.Employee;

public class Developer extends Employee {

    private ProgamingLenguaje lenguaje;

    public Developer(long idEmpoye, String fullName, double salary, ProgamingLenguaje lenguaje) {
        super(idEmpoye, fullName, "developer", salary);
        this.lenguaje = lenguaje;
    }

    public ProgamingLenguaje getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(ProgamingLenguaje lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProgamingLenguaje: " + lenguaje + "\n\n";
    }
}
