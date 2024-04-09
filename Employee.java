package one;

public class Employee extends Person{
    private String employeeID;
    public Employee(String name, Size size) {
        super(name, size);

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
