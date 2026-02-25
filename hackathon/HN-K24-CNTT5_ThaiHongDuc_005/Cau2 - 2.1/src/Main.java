import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 2;
        int count = 0;
        while (count<k){
            count++;
            int temp =0;
            for (int i = 1; i < n-1 ; i++) {
                arr[n-1] = temp;
                arr[i] = arr[i+1];
            }
            arr[0] = temp;
        }
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[i]);
        };
    }
}