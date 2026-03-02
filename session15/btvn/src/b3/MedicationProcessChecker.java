package b3;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> st = new Stack<>();
    public boolean checkProcess(String[] actions) {
        for (int i = 0; i < actions.length; i++) {
            String a = actions[i];
            if (a.equalsIgnoreCase("PUSH")) {
                st.push("Medication");
                System.out.println("Bước " + (i + 1) + ": Phát thuốc");
            } else if (a.equalsIgnoreCase("POP")) {
                if (st.isEmpty()) {
                    System.out.println("lỗi tại bước " + (i + 1));
                    return false;
                }
                st.pop();
                System.out.println("Bước " + (i + 1) + ": Hoàn tất phát thuốc");
            } else {
                System.out.println("không hợp lệ tại bước " + (i + 1));
                return false;
            }
        }
        if (!st.isEmpty()) {
            System.out.println(st.size() + " thuốc chưa hoàn tất.");
            return false;
        }
        System.out.println("hợp lệ.");
        return true;
    }
    public void reset() {
        st.clear();
    }
}
