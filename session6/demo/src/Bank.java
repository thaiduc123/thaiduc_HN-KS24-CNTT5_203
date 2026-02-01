public class Bank {
    private String accountNumber;
    private String ownerName;
    private double balance;
    public Bank() {
        this.accountNumber = "";
        this.ownerName = "";
        this.balance = 0.0;
    }
    public Bank(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Nạp thành công" + money + " VNĐ");
        } else {
            System.out.println("không hợp lệ");
        }
    }
    public void withdraw(double money) {
        if (money <= 0) {
            System.out.println("không hợp lệ");
        } else if (balance - money < 0) {
            System.out.println("số dư không đủ");
        } else {
            balance -= money;
            System.out.println("Rút thành công" + money + " VNĐ");
        }
    }
    public void display() {
        System.out.println("-----------------------------------");
        System.out.println("Số TK: " + accountNumber);
        System.out.println("Name: " + ownerName);
        System.out.println("Balance: " + balance + " VNĐ");
        System.out.println("-----------------------------------");
    }
}
