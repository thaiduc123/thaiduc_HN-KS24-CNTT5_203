public class Staff extends Employee {
    public Staff() {
    }

    public Staff(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}