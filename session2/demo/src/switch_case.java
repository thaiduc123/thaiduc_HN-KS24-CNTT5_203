import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai xe:");
        String vehicle = sc.nextLine();
        int price = 0;
        switch (vehicle){
            case "Cang hai":
                price = 0;
                break;
            case "xe dap":
                price = 10000;
                break;
            case "xe may":
                price = 30000;
                break;
            case "o to":
                price = 50000;
                break;
            default:
                System.out.println("Khong phai phuong tien");
        }
        System.out.printf("So tien gui xe la: %d VND", price);
    }
}
