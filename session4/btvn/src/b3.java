public class b3 {
    public static void main(String[] args) {
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };
        long startSB = System.currentTimeMillis();
        StringBuilder reportSB = new StringBuilder();
        reportSB.append("Ngày tạo: 24/01/2026\n");
        for (int i = 0; i < transactions.length; i++) {
            reportSB.append("Giao dịch: ").append(transactions[i]).append("\n");
        }
        long endSB = System.currentTimeMillis();
        long startStr = System.currentTimeMillis();
        String reportStr = "";
        reportStr += "Ngày tạo: 24/01/2026\n";
        for (int i = 0; i < transactions.length; i++) {
            reportStr += "Giao dịch: " + transactions[i] + "\n";
        }
        long endStr = System.currentTimeMillis();
        System.out.println(reportSB.toString());
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: " + (endStr - startStr));
    }
}
