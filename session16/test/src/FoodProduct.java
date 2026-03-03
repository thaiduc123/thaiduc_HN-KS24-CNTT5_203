public class FoodProduct extends Product {
    int discount;
    public FoodProduct(String id, String name, double price, int discount) {
        super(id, name, price);
        this.discount = discount;
    }
    @Override
    public double calculateFinalPrice() {
        return price - (price * discount / 100.0);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giảm giá: " + discount + "%");
    }
}