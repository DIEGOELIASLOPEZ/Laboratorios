package org.generatio.mx.employee;

public class EmployeeMain {

   public static void main(String[] args) {
       Employee jahel = new Employee("Jahel", "Hernández", 18, 20000, "Instructor");
       Employee ernesto = new Employee("Ernesto", "Nava", 30, 25000, "Developer Backend");
       Employee tan = new Employee("Tan", "Serrano", 29, 28000, "Developer Frontend");
       Employee david = new Employee("David", "Vargas", 26, 30000, "QA");
       Employee alma = new Employee("Alma", "Carmona", 45, 150000, "CEO SAT");
       Employee mario = new Employee("Mario", "Valero", 29, 22000, "Tester");


       System.out.println(jahel);
       System.out.println(ernesto);

       System.out.println(tan.getFullName());
       System.out.println(david.getFullName());

       System.out.println();
       System.out.println(alma.getFirstName() + " has " + alma.getYearsRetirement() + " years left until retirement.");
       System.out.println(mario.getFirstName() + " has " + alma.getYearsRetirement() + " years left until retirement.");


       System.out.println();
       System.out.println(jahel.getPositionEmpoyed());
       System.out.println(ernesto.getPositionEmpoyed());
       System.out.println(tan.getPositionEmpoyed());
       System.out.println(david.getPositionEmpoyed());
       System.out.println(alma.getPositionEmpoyed());
       System.out.println(mario.getPositionEmpoyed());


       System.out.println();
       System.out.println("Current salary of " + ernesto.getFirstName() + " is $" + ernesto.getSalary());
       System.out.println("Salary with a 10% increase: $" + ernesto.incrementSalary(10));
       System.out.println();
       System.out.println("Current salary of " + tan.getFirstName() + " is $" + tan.getSalary());
       System.out.println("Salary with a 10% increase: $" + tan.incrementSalary(10));


       System.out.println();
       mario.setPosition("CEO");
       System.out.println(mario.getPosition());


   }
}
