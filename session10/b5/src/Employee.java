public abstract class Employee {
    public String name;
    public double baseSalary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.baseSalary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + baseSalary);
    };

    public abstract double calculateSalary();
}