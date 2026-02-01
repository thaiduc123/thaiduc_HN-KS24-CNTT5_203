
public class b6 {
    public static void main(String[] args) {
        User u1 = new User(1, "thaiduc", "123456", "thaiduc@gmail.com");
        u1.displayInfo();
        User u2 = new User(2, "user2", "abc123", "user2gmail.com");
        u2.displayInfo();
        User u3 = new User(3, "user3", "", "user3@gmail.com");
        u3.displayInfo();
    }
}
