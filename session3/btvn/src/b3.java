public class b3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        for (int n : quantities) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Sách có số lượng nhiều nhất (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println(names[i]);
            }
        }
    }
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        for (int n : quantities) {
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Sách có số lượng ít nhất (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println(names[i]);
            }
        }
    }
    public static void main(String[] args) {
        String[] names = {"Pickle ball", "Thick of it", "Doraemon", "1001 cach de tro nen dep trai", "Dom dom"};
        int[] quantities = {50, 50, 5, 20, 20};
        maxQuantityOfBooks(names, quantities);
        minQuantityOfBooks(names, quantities);
    }
}
