public class b2 {
    public static void main(String[] args) {
        Account acc = new Account("thaiduc","123456","thaiduc@gmail.com");
        acc.displayInfo();
        acc.changePassword("abc@2026");
        acc.displayInfo();
    }
}
