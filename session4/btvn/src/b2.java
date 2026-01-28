public class b2 {
    public static void main(String[] args) {
        String d = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";
        if (d.contains("Kệ:")) {
            int start = d.indexOf("Kệ:") + 4;
            int end = d.indexOf(",", start);
            String position = d.substring(start, end).trim();
            String newDescription = d.replace("Kệ:", "Vị trí:");
            System.out.println("Vị trí tìm thấy: " + position);
            System.out.println("Mô tả: " + newDescription);
        } else {
            System.out.println("Không tìm thấy thông tin");
        }
    }
}
