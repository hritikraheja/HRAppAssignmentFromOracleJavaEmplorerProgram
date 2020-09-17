package definitions;

public class Department {
    private String departmentName;
    private Employee[] allEmployeesInDepartment = new Employee[10];
    private int numberOfEmployees = 0;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
}