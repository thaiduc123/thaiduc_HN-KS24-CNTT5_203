import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();
        System.out.print("Nhập giá sách: ");
        double price = sc.nextDouble();
        System.out.print("Tình trạng sách: ");
        boolean isAvailable = sc.nextBoolean();
        int age = 2026 - publishYear;
        System.out.println("\nTHÔNG TIN SÁCH");
        System.out.println("Mã sách: " + bookID);
        System.out.println("Tên sách: " + bookName.toUpperCase());
        System.out.printf("Giá: %.2f\n", price);
        System.out.println("Tuổi thọ sách: " + age + " năm");
        System.out.println("Tình trạng: " + (isAvailable ? "Còn sách" : "Đã mượn"));
    }
}