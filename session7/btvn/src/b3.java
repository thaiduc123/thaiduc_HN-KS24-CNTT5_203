import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số điểm: ");
        n = sc.nextInt();
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm thứ " + (i + 1) + ": ");
            scores[i] = sc.nextDouble();
        }
        System.out.println("\nKết quả:");
        double average = ScoreUtils.calculateAverage(scores);
        System.out.printf("Điểm trung bình cả lớp: %.2f\n", average);
        for (int i = 0; i < scores.length; i++) {
            if (ScoreUtils.checkPass(scores[i])) {
                System.out.println("Điểm " + scores[i] + ": Đạt");
            } else {
                System.out.println("Điểm " + scores[i] + ": Trượt");
            }
        }
    }
}
