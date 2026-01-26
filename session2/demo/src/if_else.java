import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        // if else
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tuoi:");
        int age = sc.nextInt();
        System.out.println("Nhap so luong sach:");
        int books = sc.nextInt();
        System.out.println("Co the uu tien khong:");
        boolean card = sc.nextBoolean();
        if (age >= 18 && books >= 10){
            card = true;

        } else
    }
}