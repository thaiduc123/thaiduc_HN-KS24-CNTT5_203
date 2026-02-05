package b5;

public class OfficeEmployee extends Employee {
    double baseSalary;
    OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }
    @Override
    double calculateSalary() {
        return baseSalary;
    }
}

