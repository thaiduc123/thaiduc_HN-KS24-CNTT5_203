import java.util.HashSet;
import java.util.Set;

public class b3 {
    public static void main(String[] args) {
        Set<String> med = new HashSet<>();
        med.add("Aspirin");
        med.add("Caffeine");
        med.add("Paracetamol");
        Set<String> allergy = new HashSet<>();
        allergy.add("Penicillin");
        allergy.add("Aspirin");
        Set<String> warning = new HashSet<>(med);
        warning.retainAll(allergy);
        Set<String> safe = new HashSet<>(med);
        safe.removeAll(allergy);
        System.out.println("Thuốc: " + med);
        System.out.println("Dị ứng: " + allergy);
        if (!warning.isEmpty()) {
            System.out.println("Cảnh báo dị ứng: " + warning);
        } else {
            System.out.println("Không có thành phần gây dị ứng.");
        }
        System.out.println("Thành phần an toàn: " + safe);
    }
}