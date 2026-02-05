public class Student extends Person {
    String studentId;
    double gpa;
    Student(String fullName, int age, String studentId, double gpa) {
        super(fullName, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }
    public void displayStudentInfo() {
        displayInfo();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + gpa);
    }
}
