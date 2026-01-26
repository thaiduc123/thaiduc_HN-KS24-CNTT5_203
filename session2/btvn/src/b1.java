import java.util.Scanner;
public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.print("Nhập số sách đang mượn: ");
        int bookCount = sc.nextInt();
        if (age < 18) {
                System.out.println("Kết quả: Không đủ điều kiện");
                System.out.println("Lý do: bạn phải trên 18");
        } else if (bookCount >= 3) {
                System.out.println("Kết quả: Không đủ điều kiện");
                System.out.printf("Lý do: bạn đã mượn %d cuốn", bookCount);
        } else{
            System.out.println("Kết quả: Đủ điều kiện mượn sách");
        }
    }
}
