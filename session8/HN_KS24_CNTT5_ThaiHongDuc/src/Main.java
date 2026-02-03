import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;
        int choice;
        do {
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (count + 1));
                        System.out.print("Mã SV: ");
                        String id = sc.nextLine();
                        System.out.print("Họ tên: ");
                        String name = sc.nextLine();
                        System.out.print("Điểm: ");
                        double score = Double.parseDouble(sc.nextLine());
                        students[count] = new Student(id, name, score);
                        count++;
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("danh sách trống");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("học lực cần tìm: ");
                    String rank = sc.nextLine();
                    int found = 0;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getRank().equalsIgnoreCase(rank)) {
                            System.out.println("Mã: " + students[i].getId());
                            System.out.println("Tên: " + students[i].getName());
                            System.out.println("Điểm: " + students[i].getScore());
                            System.out.println("Học lực: " + students[i].getRank());
                            found = 1;
                        }
                    }
                    if (found!=1) {
                        System.out.println("không tìm thấy sinh viên");
                    }
                    break;
                case 4:
                    if (count == 0) {
                        System.out.println("danh sách trống");
                    } else {
                        System.out.println("Sắp xếp theo học lực giảm dần: ");
                        for (int i = 0; i < count-1; i++) {
                            for (int j = 0; j < count; j++) {
                                if(students[i].getScore() < students[j].getScore()){
                                    Student temp = students[i];
                                    students[i] = students[j];
                                    students[j] = temp;
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("không hợp lệ");
            }

        } while (choice != 5);
    }
}