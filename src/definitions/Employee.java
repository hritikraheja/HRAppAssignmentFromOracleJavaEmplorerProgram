package definitions;

public class Employee {
    private int identificationNumber;
    private String name;
    private double salary;

    public Employee(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public Employee(int identificationNumber, String name) {
        this.identificationNumber = identificationNumber;
        this.name = name;
    }

    public Employee(int identificationNumber, String name, double salary) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.salary = salary;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

}
