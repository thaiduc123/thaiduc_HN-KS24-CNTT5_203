public class Book {
    String title;
    String author;
    double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Ten sach: " + title);
        System.out.println("Tac gia: " + author);
        System.out.println("Gia: " + price);
        System.out.println("---------------------");
    }
}

