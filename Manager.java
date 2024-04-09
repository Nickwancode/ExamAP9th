package one;

public class Manager extends Person{

    public Manager(String name, Size size) {
        super(name, size);

    }
    public int Salary;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
