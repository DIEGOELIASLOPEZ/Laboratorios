package org.generation.mx.main;

import org.generation.mx.modal.Employee;
import org.generation.mx.modal.developer.Developer;
import org.generation.mx.modal.developer.ProgamingLenguaje;
import org.generation.mx.modal.manager.Manager;
import org.generation.mx.service.DeveloperService;
import org.generation.mx.service.EmployeeService;
import org.generation.mx.service.ManagerSerivice;

public class Main {
    public static void main(String[] args) {

        Manager michealScott = new Manager(1L, "Micheal Scott", 100000.0, 2000.0);
        Manager Jesus = new Manager(1L, "Micheal Scott", 100000.0, 2000.0);
        ManagerSerivice managerSerivice = new ManagerSerivice();

        managerSerivice.addManager(michealScott);
        managerSerivice.addManager(Jesus);

//        System.out.println(managerSerivice.getManagers());;


        Developer developer1 = new Developer(2L, "Dwight", 20000, ProgamingLenguaje.JAVA);
        Developer developer2 = new Developer(3L, "Jim", 20000, ProgamingLenguaje.JAVA);

        DeveloperService developerService = new DeveloperService();
        developerService.addDeveloper(developer1);
        developerService.addDeveloper(developer2);

//        System.out.println(developerService.getDevelopers());


        EmployeeService employeeService = new EmployeeService();
        employeeService.addEmployee(michealScott);
        employeeService.addEmployee(Jesus);
        employeeService.addEmployee(developer1);
        employeeService.addEmployee(developer2);

        System.out.println(employeeService.getEmployees());


    }
}
