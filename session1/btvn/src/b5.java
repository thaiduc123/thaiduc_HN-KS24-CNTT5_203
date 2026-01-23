import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách (4 chữ số): ");
        int n = sc.nextInt();
        int thousands = n / 1000;
        int hundreds = (n / 100) % 10;
        int dozens = (n / 10) % 10;
        int units = n % 10;
        int sumOfFirstThree = thousands + hundreds + dozens;
        boolean isValid = (sumOfFirstThree % 10 == units);
        System.out.println("Tổng 3 chữ số đầu: " + sumOfFirstThree);
        System.out.println("Kết quả kiểm tra mã sách: " + isValid);
    }
}
