public class b4 {
    public static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] books = {23, 435, 2, 323,43, 345,12,935,67,36};
        System.out.print("trước khi sắp xếp: ");
        displayBooks(books);
        sortBooks(books);
        System.out.print("sau khi sắp xếp: ");
        displayBooks(books);
    }
}
