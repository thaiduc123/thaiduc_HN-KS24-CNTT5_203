public class Employee {
    String name;
    double baseSalary;
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Lương: " + baseSalary);
    }
}
