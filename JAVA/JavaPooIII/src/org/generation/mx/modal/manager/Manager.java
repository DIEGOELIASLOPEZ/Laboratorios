package org.generation.mx.modal.manager;

import org.generation.mx.modal.Employee;

public class Manager extends Employee {
    private Double bonus;


    public Manager(long idEmpoye, String fullName, double salary, Double bonus) {
        super(idEmpoye, fullName, "manager", salary);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + bonus + "\n\n";
    }
}
