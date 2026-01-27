import java.util.Scanner;

public class b5 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int m=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                m = i;
                break;
            }
        }
        for (int i = m; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Đã xóa sách mã " + bookId);
        return n - 1;
    }
    public static void displayBooks(int[] arr, int n) {
        System.out.println("Kho sách hiện tại: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = 5;
        while (true) {
            if (n == 0) {
                break;
            }
            displayBooks(books, n);
            System.out.print("\nNhập mã sách cần xóa (0 để thoát): ");
            int id = sc.nextInt();
            if (id == 0) {
                break;
            }
            n = deleteBook(books, n, id);
        }
    }
}
