import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dailyFee = 5000;
        int total = 0;
        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số ngày trễ của cuốn thứ " + i + ": ");
            int days = sc.nextInt();
            total += days * dailyFee;
        }

        System.out.println("===> Tổng tiền phạt: " + total + " VND");
    }
}