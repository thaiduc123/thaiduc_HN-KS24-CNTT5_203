import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxCount = 0;
        char maxChar = 0;
        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)){
                continue;
            };
            if (c == ' '){
                continue;
            };
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(j) == c){
                    count++;
                };
            }
            if (count > maxCount){
                maxCount = count;
                System.out.println(maxCount);
            };
        }
    }
}