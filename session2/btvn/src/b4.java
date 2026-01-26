import java.util.Scanner;
public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        do {
            System.out.print("Nhập mã ID: ");
            id = sc.nextInt();
            if (id <= 0) {
                System.out.println("ko hợp lệ, id phải dương");
            }
        } while (id <= 0);
        System.out.printf("Xác nhận mã %d đã ghi nhận", id);
    }
}