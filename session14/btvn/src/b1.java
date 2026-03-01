import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class b1 {
    public static void main(String[] args) {
        String[] input = {"Nguyễn Văn A – Yên Bái", "Trần Thị B – Thái Bình", "Nguyễn Văn A – Yên Bái", "Lê Văn C – Hưng Yên"};
        Set<String> list = new LinkedHashSet<>(Arrays.asList(input));
        for (String patient : list) {
            System.out.println(patient);
        }
    }
}