import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static StudentManager manager = new StudentManager(100);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> manager.displayAll();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> manager.sortByAverageDesc();
                case 7 -> manager.statistics();
                case 9 -> System.out.println("Thoát chương trình!");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 9);
    }

    static void showMenu() {
        System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Tìm kiếm sinh viên");
        System.out.println("4. Cập nhật sinh viên");
        System.out.println("5. Xóa sinh viên");
        System.out.println("6. Sắp xếp theo điểm TB");
        System.out.println("7. Thống kê");
        System.out.println("9. Thoát");
        System.out.print("Chọn: ");
    }

    static void addStudent() {
        System.out.print("Mã SV: ");
        String id = sc.nextLine();
        System.out.print("Họ tên: ");
        String name = sc.nextLine();
        System.out.print("Tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Điểm Toán: ");
        double math = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm Lý: ");
        double physics = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm Hóa: ");
        double chemistry = Double.parseDouble(sc.nextLine());
        Student s = new Student(id, name, age, gender, math, physics, chemistry);
        System.out.println(manager.addStudent(s)
                ? "Thêm thành công!"
                : "Thêm thất bại!");
    }

    static void searchStudent() {
        System.out.print("Nhập tên cần tìm: ");
        manager.findByName(sc.nextLine());
    }

    static void updateStudent() {
        System.out.print("Nhập mã SV: ");
        String id = sc.nextLine();

        System.out.print("Tên mới: ");
        String name = sc.nextLine();
        System.out.print("Tuổi mới: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Toán: ");
        double math = Double.parseDouble(sc.nextLine());
        System.out.print("Lý: ");
        double physics = Double.parseDouble(sc.nextLine());
        System.out.print("Hóa: ");
        double chemistry = Double.parseDouble(sc.nextLine());

        System.out.println(manager.updateStudent(id, name, age, math, physics, chemistry)
                ? "Cập nhật thành công!"
                : "Không tìm thấy sinh viên!");
    }

    static void deleteStudent() {
        System.out.print("Nhập mã SV cần xóa: ");
        System.out.println(manager.deleteStudent(sc.nextLine())
                ? "Xóa thành công!"
                : "Không tìm thấy sinh viên!");
    }
}
