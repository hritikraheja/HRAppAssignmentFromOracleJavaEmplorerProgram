package execution;

import definitions.Department;
import definitions.Employee;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HR App Starts");
        Department departmentObject = new Department("Education");
        System.out.println(departmentObject.toString());
        departmentObject.addEmployee(new Employee(101,"Hritik", 1200.10));
        departmentObject.addEmployee(new Employee(102,"Divyansh", 1300.20));
        departmentObject.addEmployee(new Employee(103,"Jai", 1400.50));
        departmentObject.addEmployee(new Employee(104,"Prarabdh", 1540.90));
        departmentObject.addEmployee(new Employee(105,"Jatin", 1500.40));
        System.out.println("There are " + departmentObject.getNumberOfEmployees() + " Employees in this Department : ");
        departmentObject.printDetailsOfEmployees();
        System.out.println("Total Salary : " + departmentObject.getTotalSalary());
        System.out.println("Average Salary : " + departmentObject.getAverageSalary());
    }
}