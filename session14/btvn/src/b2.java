import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Map<String, String> med = new HashMap<>();
        med.put("T01", "Paracetamol");
        med.put("T02", "Ibuprofen");
        med.put("T03", "Amoxicillin");
        med.put("T04", "Aspirin");
        med.put("T05", "Vitamin C");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String code = sc.nextLine();
        if (med.containsKey(code)) {
            System.out.println("Tên thuốc: " + med.get(code));
        } else {
            System.out.println("không tồn tại");
        }
    }
}