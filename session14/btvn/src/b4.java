import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class b4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Cúm A");
        list.add("Sốt xuất huyết");
        list.add("Cúm A");
        list.add("Covid-19");
        list.add("Cúm A");
        list.add("Sốt xuất huyết");
        Map<String, Integer> report = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            String disease = list.get(i);
            if (report.containsKey(disease)) {
                report.put(disease, report.get(disease) + 1);
            } else {
                report.put(disease, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}