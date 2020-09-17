package definitions;

public class Department {
    private String departmentName;
    private Employee[] allEmployeesInDepartment = new Employee[10];
    private int numberOfEmployees = 0;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * This method increments the Number Of Employees working in the Department by 1.
     */
    private void incrementNumberOfEmployees() {
        numberOfEmployees++;
    }

    /**
     * This method adds an employee to the Department.
     *
     * @param employee An employee with Name, Identification Number and Salary.
     */
    public void addEmployee(Employee employee){
        if (getNumberOfEmployees() <= 10) {
            allEmployeesInDepartment[numberOfEmployees] = employee;
            incrementNumberOfEmployees();
        } else {
            System.out.println("NO MORE EMPLOYEES CAN BE ADDED. Department Capacity Is Full.");
        }
    }

    /**
     * This method prints the details of all Employees working in this Department.
     */
    public void printDetailsOfEmployees() {
        for (int employeeNumber = 0; employeeNumber < numberOfEmployees; employeeNumber++) {
            System.out.println(allEmployeesInDepartment[employeeNumber].toString());
        }
    }
}