public class b4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("NV01", "THD");
        Employee e3 = new Employee("NV02", "HDT", 12000000);
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
