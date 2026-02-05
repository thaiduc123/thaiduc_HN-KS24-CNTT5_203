public class b4 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.wagTail();
        }
    }
}
