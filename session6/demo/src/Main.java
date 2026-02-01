public class Main {
    public static void main(String[] args) {
        Bank per1= new Bank("0971458111", "THD", 1000000);
        Bank per2 = new Bank("0396871579", "HDT", 5000);
        System.out.println("trước giao dịch:");
        per1.display();
        per2.display();
        per1.deposit(20000);
        per2.withdraw(1000);
        System.out.println("sau giao dịch:");
        per1.display();
        per2.display();
    }
}