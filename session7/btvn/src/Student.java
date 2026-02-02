public class Student {
    String studentId;
    String name;
    static int totalStudent = 0;
    Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        totalStudent++;
    }
    public void displayInfo() {
        System.out.println("MSV: " + studentId + ", Tên: " + name);
    }
    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên: " + totalStudent);
    }
}
