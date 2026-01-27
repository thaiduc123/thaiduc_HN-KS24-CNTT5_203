import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ids = new int[100];
        String[] titles = new String[100];
        int[] quantities = new int[100];
        int current = 0;
        do {
            System.out.println("""
                    1. Xem danh sách:
                    2. Thêm sách mới:
                    3. Cập nhật số lượng:
                    4. Xóa sách:
                    5. Tìm kiếm:
                    6. Sắp xếp theo số lượng:
                    7. Thoát
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    if (current == 0){
                        System.err.println("danh sach trong");
                    } else {
                        for (int i = 0; i<current; i++){
                            System.out.println("id: "+ ids[i]);
                            System.out.println("titles: "+ titles[i]);
                            System.out.println("quantities: "+ quantities[i]);
                        }
                    }
                    break;
                case 2:
                    if (current == 100){
                        System.err.println("Danh sach da day");
                    } else {
                        System.out.print("Nhap so luong:");
                        int n = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i<n; i++){
                            System.out.print("Nhap id: ");
                            ids[i] = sc.nextInt();
                            System.out.println("Nhap title: ");
                            titles[i]= sc.nextLine();
                            System.out.println("Nhap so luong: ");
                            quantities[i] = sc.nextInt();
                            current++;
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        }while (true);
    }
}