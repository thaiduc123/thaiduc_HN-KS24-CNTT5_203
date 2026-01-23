import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ tự của sách trong hệ thống: ");
        int stt = sc.nextInt();
        int shelfNumber = (stt - 1) / 25 + 1;
        int shelfPos = (stt - 1) % 25 + 1;
        String zone = (shelfNumber <= 10) ? "Khu Cận" : "Khu Viễn";
        System.out.println("\n THÔNG TIN ĐỊNH VỊ ");
        System.out.println("Sách số: " + stt);
        System.out.println("Địa chỉ: Kệ " + shelfNumber + " - Vị trí " + shelfPos);
        System.out.println("Phân khu: " + zone);
    }
}
