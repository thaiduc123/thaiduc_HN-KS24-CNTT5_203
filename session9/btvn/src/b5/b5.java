package b5;

public class b5{
    public static void main(String[] args) {
        Employee e1 = new OfficeEmployee("THD", 5000000);
        Employee e2 = new ProductionEmployee("THD", 5, 4000);
        Employee e3 = new ProductionEmployee("HDT", 10, 8000);
        double totalSalary = 0;
        System.out.println("Danh sách lương nhân viên:");
        System.out.println("1. " + e1.name + " - Lương: " + e1.calculateSalary());
        totalSalary += e1.calculateSalary();
        System.out.println("2. " + e2.name + " - Lương: " + e2.calculateSalary());
        totalSalary += e2.calculateSalary();
        System.out.println("3. " + e3.name + " - Lương: " + e3.calculateSalary());
        totalSalary += e3.calculateSalary();
        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: " + totalSalary);
    }
}

