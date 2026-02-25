import java.util.Scanner;

public class Cau1_Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String vowels = "";
        String consonants = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Kiểm tra có phải chữ cái không
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels += c;
                } else {
                    consonants += c;
                }
            }
        }

        System.out.println("Nguyên âm: " + vowels);
        System.out.println("Phụ âm: " + consonants);
    }
}

import java.util.Scanner;

public class Cau1_Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        char maxChar = 0;
        int maxCount = 0;

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (c == ' ') continue;
            if (!Character.isLetter(c)) continue;

            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == c) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = c;
            }
        }

        System.out.println(maxChar + " (xuất hiện " + maxCount + " lần)");
    }
}
import java.util.Scanner;

public class Cau2_Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int k = 0; // vị trí ghi

        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nKích thước mới: " + k);
    }
}
import java.util.Scanner;

public class Cau2_Phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while (left < right) {

            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 != 0) {
                right--;
            } else {
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class Cau3 {
    public static void main(String[] args) {

        int[] A = {1, 2, 2, 3, 4, 6};
        int[] B = {2, 4, 4, 5};

        for (int i = 0; i < A.length; i++) {

            boolean existsInB = false;
            boolean printedBefore = false;

            // kiểm tra trong B
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    existsInB = true;
                    break;
                }
            }

            // kiểm tra đã in trước đó chưa
            for (int k = 0; k < i; k++) {
                if (A[i] == A[k]) {
                    printedBefore = true;
                    break;
                }
            }

            if (existsInB && !printedBefore) {
                System.out.print(A[i] + " ");
            }
        }
    }
}