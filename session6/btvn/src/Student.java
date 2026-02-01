public class Student {
    String studentId;
    String fullName;
    int birthYear;
    double gpa;
    public Student(String studentId, String fullName, int birthYear, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }
    public void displayInfo() {
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Ho ten: " + fullName);
        System.out.println("Nam sinh: " + birthYear);
        System.out.println("Diem trung binh: " + gpa);
        System.out.println("-----------------------");
    }
}
