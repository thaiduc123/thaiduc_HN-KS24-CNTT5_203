import java.awt.print.PrinterGraphics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int birthYear = 2006;
        int nowYear = 2026;
        int age = nowYear - birthYear;
//        System.out.print(age);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Tuoi:");
        int myAge = Integer.parseInt(sc.nextLine());
//        String myName  = sc.next()
        System.out.println(myAge);
        System.out.print("Nhap Ten:");
        String myName = sc.nextLine();
        System.out.println(myName);
        System.out.println("==============================================");
        System.out.printf("| %-6s | %-6s | %-6s | %-6s | %-6s |\n", "THD", "DTH", "DHT", "TDH", "HDT");
        System.out.println("==============================================");
    }
}
