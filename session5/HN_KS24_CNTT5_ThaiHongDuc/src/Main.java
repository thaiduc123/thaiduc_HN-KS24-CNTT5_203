import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int size = 0;
        String[] list = new String[100];
        String regex = "^B\\d{7}$";
        Pattern pattern = Pattern.compile(regex);
        do {
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm mới MSSV");
            System.out.println("3. Cập nhật MSSV theo index");
            System.out.println("4. Xóa MSSV theo mã");
            System.out.println("5. Tìm kiếm MSSV (Regex)");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (size == 0) {
                        System.out.println("Danh sách trống");
                        System.out.println("\n");
                        break;
                    } else {
                        System.out.println("Danh sách MSSV: ");
                        for (int i = 0; i < size; i++) {
                            System.out.println((i + 1) + "-" + list[i]);
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    if (size >= 100) {
                        System.out.println("Danh sách đã đầy");
                        System.out.println("\n");
                        break;
                    }
                    String s;
                    System.out.print("Nhập MSSV mới: ");
                    s = sc.nextLine().trim();
                    Matcher matcher = pattern.matcher(s);
                    if (!matcher.matches()) {
                        System.out.println("Sai định dạng");
                        System.out.println("\n");
                        break;
                    }
                    list[size++] = s;
                    System.out.println("Thêm thành công");
                    System.out.println("\n");
                    break;
                case 3:
                    if (size ==0){
                        System.out.println("Danh sách trống");
                        System.out.println("\n");
                        break;
                    }
                    System.out.print("Nhập vị trí sửa: ");
                    int pos = Integer.parseInt(sc.nextLine()) - 1;
                    if (pos < 0 || pos>size){
                        System.out.println("Vị trí không hợp lệ");
                        System.out.println("\n");
                        break;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    System.out.print("Nhập mssv cần tìm: ");
                    String n = sc.nextLine().trim().toLowerCase();
                    int found = 0;
                    for (int i = 0; i < size; i++) {
                        if (list[i].toLowerCase().contains(n)) {
                            System.out.println(list[i]);
                            found = 1;
                        }
                    }
                    if (found == 0) {
                        System.out.println("Không tìm thấy MSSV");
                        System.out.println("\n");
                        break;
                    }
                    break;
                case 6:
                   break;
                default:
                    break;
            }
        } while (choice != 6);
    }
}





