public class Coffee extends Drink{
    boolean hasMilk;
    public Coffee(int id, String name, double price, boolean hasMilk){
        super(id, name, price);
        this.hasMilk = hasMilk;
    }
    @Override
    public double calculatePrice(){
        if (hasMilk == true){
            price = price + 5000;
        };
        return price;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        if (hasMilk = true){
            System.out.println("Có sữa");
        } else {
            System.out.println("Không sữa");
        }
    }
}
