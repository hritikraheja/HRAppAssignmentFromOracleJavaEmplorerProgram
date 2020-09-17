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

}