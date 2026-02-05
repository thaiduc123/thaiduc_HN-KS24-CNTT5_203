package b5;

public class ProductionEmployee extends Employee {
    int numOfProducts;
    double price;
    ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }
    @Override
    double calculateSalary() {
        return numOfProducts * price;
    }
}
