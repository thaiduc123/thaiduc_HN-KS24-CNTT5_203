public class Bicycle extends Vehicle{
    public String moving;
    public Bicycle() {
    }
    public Bicycle(String moving) {
        this.moving = moving;
    }
    public Bicycle(String brand, String moving) {
        super(brand);
        this.moving = moving;
    }
    public String getMoving() {
        return moving;
    }
    public void setMoving(String moving) {
        this.moving = moving;
    }
    @Override
    public void move() {
        System.out.println(moving + " - Di chuyển bằng sức người");
    }
}