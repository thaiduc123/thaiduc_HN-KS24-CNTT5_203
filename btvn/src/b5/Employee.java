package b5;

public abstract class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    abstract double calculateSalary();
}
