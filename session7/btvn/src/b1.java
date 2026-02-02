public class b1 {
    public static void main(String[] args) {
        Student s1 = new Student("B24DTCN327", "THD");
        Student s2 = new Student("B24DTCN328", "DTH");
        Student s3 = new Student("B24DTCN329", "HDT");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        Student.displayTotalStudent();
    }
}
