import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 100000;
        int total = 0;
        int openDays = 0;
        for (int i = 2; i <= 8; i++) {
            String weekDays;
            if (i == 8) {
                weekDays = "Chu Nhat";
            } else {
                weekDays = "Thu " + i;
            }
            System.out.print("Nhap luot muon ngay " + weekDays + ": ");
            int borrow = sc.nextInt();
            if (borrow == 0) {
                continue;
            }
            if (borrow > max) {
                max = borrow;
            }
            if (borrow < min) {
                min = borrow;
            }
            total += borrow;
            openDays++;
        }
        System.out.println("\n--- KET QUA THONG KE ---");
        if (openDays == 0) {
            System.out.println("Khong co ngay nao mo cua");
        } else {
            double trungBinh = (double) total / openDays;
            System.out.println("Luot muon cao nhat: " + max);
            System.out.println("Luot muon thap nhat: " + min);
            System.out.println("Trung binh luot muon/ngay: " + trungBinh);
        }
    }
}
