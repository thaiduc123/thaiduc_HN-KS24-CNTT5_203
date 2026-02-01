public class Account {
    String username;
    String password;
    String email;
    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Doi mat khau thanh cong!");
    }
    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("--------------------");
    }
}