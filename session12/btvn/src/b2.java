import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class b2 {
    public static void main(String[] args) {
        List<String> meds = new ArrayList<>();
        meds.add("Paracetamol");
        meds.add("Ibuprofen");
        meds.add("Panadol");
        meds.add("Paracetamol");
        meds.add("Aspirin");
        meds.add("Ibuprofen");
        System.out.println("Input: " + meds);
        List<String> afterList = new ArrayList<>();
        for (int i = 0; i < meds.size(); i++) {
            String m = meds.get(i);
            if (!afterList.contains(m)) {
                afterList.add(m);
            }
        }
        Collections.sort(afterList);
        System.out.println("Output: " + afterList);
    }
}