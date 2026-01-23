import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách : ");
        double priceUSD = sc.nextDouble();
        System.out.print("Nhập tỷ giá : ");
        float exchangeRate = sc.nextFloat();
        double totalVND = priceUSD * exchangeRate;
        long roundedVND = (long) totalVND;
        System.out.println("Giá sách (USD): " + priceUSD);
        System.out.println("Tổng tiền VNĐ: " + totalVND);
        System.out.println("Tổng tiền VNĐ làm tròn: " + roundedVND + " VNĐ");
    }
}