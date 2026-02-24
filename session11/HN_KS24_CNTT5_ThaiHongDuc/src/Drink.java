public abstract class Drink {
    int id;
    String name;
    double price;
    public Drink(){};
    public Drink(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    };
    public int getId(){
        return id;
    };
    public void setId(){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(){
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("Mã: " + id);
        System.out.println("Tên: "+ name);
        System.out.println("Giá: "+ price);
    }
    public abstract double calculatePrice();
}
