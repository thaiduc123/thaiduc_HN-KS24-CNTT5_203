public class Employee {
    String id;
    String name;
    double salary;
    public Employee() {
        this.id = "N/A";
        this.name = "Chua co ten";
        this.salary = 0;
    }
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0;
    }
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Ma NV: " + id);
        System.out.println("Ten NV: " + name);
        System.out.println("Luong: " + salary);
        System.out.println("---------------------");
    }
}