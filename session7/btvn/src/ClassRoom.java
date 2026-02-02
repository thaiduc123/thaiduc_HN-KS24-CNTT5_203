public class ClassRoom {
    static double classFund = 0;
    String studentName;
    ClassRoom(String studentName) {
        this.studentName = studentName;
    }
    public void contribute(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng " + amount);
        } else {
            System.out.println("không hợp lệ.");
        }
    }
    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp: " + classFund);
    }
}
