public class Manager extends Employee {
    String department;
    Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ban: " + department);
    }
}
