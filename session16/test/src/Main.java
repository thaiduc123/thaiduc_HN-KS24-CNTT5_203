//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProductRepository rep = new ProductRepository();
        rep.add(new ElectronicProduct("01", "Laptop", 15000000, 24));
        rep.add(new ElectronicProduct("02", "Tai nghe", 2000000, 6));
        rep.add(new FoodProduct("03", "Bánh mì", 20000, 10));
        rep.add(new FoodProduct("04", "Balls", 30000, 5));
        for (Product p : rep.findAll()) {
            if (p != null) {
                p.displayInfo();
                System.out.println("Thành tiền: " + p.calculateFinalPrice());
            }
        };
        System.out.println("TÌM SẢN PHẨM");
        System.out.println("SẮP XẾP GIÁ TĂNG DẦN");
//        Comparator<Product> cp = new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return (int) (o1.price - o2.price);
//            }
//        };
//        for (Product p: rep.findAll()){
//            System.out.println(p);
//        };
        System.out.println("THỐNG KÊ");
        Map<String, Integer> stats = new HashMap<>();
        for (Product p : rep.findAll()) {
            if (p instanceof ElectronicProduct) {
                stats.put("Electronic", stats.get("Electronic" + 1));
            } else if (p instanceof FoodProduct) {
                stats.put("Food", stats.get("Food" + 1));
            }
        }
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}