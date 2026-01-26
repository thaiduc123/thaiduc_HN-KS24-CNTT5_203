import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rep = 100;
        int days = 0;
        System.out.println("Nhập số ngày trễ (Nhập 999 để kết thúc)");
        while (true) {
            System.out.print("Số ngày trễ của lần này: ");
            days = sc.nextInt();
            if (days == 999) {
                break;
            }
            if (days <= 0) {
                rep += 5;
                System.out.println("Trả đúng: +5 điểm.");
            } else {
                int minus = days * 2;
                rep -= minus;
                System.out.printf("Trả trễ %d ngày: -%d điểm\n", days, minus);
            }
        }
        System.out.println("Tổng điểm: " + rep);
        if (rep > 120) {
            System.out.println("Xếp loại: ĐỘC GIẢ THÂN THIẾT");
        } else if (rep >= 80) {
            System.out.println("Xếp loại: ĐỘC GIẢ TIÊU CHUẨN");
        } else {
            System.out.println("Xếp loại: ĐỘC GIẢ CẦN LƯU Ý");
        }
        System.out.println("Tạm biệt");
    }
}