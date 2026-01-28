import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thẻ: ");
        String code = sc.nextLine();
        String regex = "^[A-Z]{2}\\d{4}\\d{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);
        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ.");
        } else {
                System.out.println("Lỗi: Định dạng mã không hợp lệ.");
        }
    }
}
