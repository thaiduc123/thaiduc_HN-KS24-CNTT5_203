import java.util.Scanner;
public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ngày chậm: ");
        int n = sc.nextInt();
        System.out.print("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();
        double t = n * m * 5000;
        if (n > 7 && m >= 3) {
            t = t * 1.2;
        }
        boolean lockCard = t > 50000;
        System.out.println("Tiền phạt gốc: " + (n * m * 5000) + " VNĐ");
        System.out.println("Tiền phạt sau: " + t + " VNĐ");
        System.out.println("Yêu cầu khóa thẻ: " + lockCard);
    }
}