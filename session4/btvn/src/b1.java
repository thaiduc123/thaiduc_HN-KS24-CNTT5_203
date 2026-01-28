import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String author = sc.nextLine();
        bookName = bookName.trim().replaceAll("\\s+", " ");
        author = author.trim().replaceAll("\\s+", " ");
        bookName = bookName.toUpperCase();
        author = author.toLowerCase();
        String[] w = author.split(" ");
        StringBuilder formattedAuthor = new StringBuilder(); //Tạo một chuỗi có thể thay đổi được
        for (int i = 0; i < w.length; i++) {
            formattedAuthor.append(Character.toUpperCase(w[i].charAt(0))).append(w[i].substring(1)).append(" ");
            //words[i].charAt(0): Lấy ký tự đầu tiên
            //Character.toUpperCase(): Viết hoa
            //append():Thêm nội dung vào StringBuilder
            //words[i].substring(1): bỏ chữ đầu
        }
        formattedAuthor = new StringBuilder(formattedAuthor.toString().trim());
        String result = bookName + " - Tác giả: " + formattedAuthor;
        System.out.println(result);
    }
}
