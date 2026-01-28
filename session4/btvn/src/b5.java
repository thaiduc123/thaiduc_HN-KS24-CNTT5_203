import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class b5 {
    public static void main(String[] args) {
        int borrowCount = 0;
        int returnCount = 0;
        String[] logs = {
                "2026-06-20 | User: HDT | Action: BORROW | BookID: BK12345",
                "2026-07-21 | User: THB | Action: RETURN | BookID: BK12543",
                "2026-08-22 | User: THD | Action: BORROW | BookID: BK67891"
        };
        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (BORROW|RETURN) \\| BookID: (BK\\d+)";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < logs.length; i++) {
            String log = logs[i];
            Matcher matcher = pattern.matcher(log);
            if (matcher.find()) {
                // Tách dữ liệu bằng Capturing Groups
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);
                System.out.println("Ngày: " + date);
                System.out.println("User: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookId);
                System.out.print("\n");
                if (action.equals("BORROW")) {
                    borrowCount++;
                } else if (action.equals("RETURN")) {
                    returnCount++;
                }
            }
        }
        System.out.println("Tổng số lượt mượn: " + borrowCount);
        System.out.println("Tổng số lượt trả: " + returnCount);
    }
}
