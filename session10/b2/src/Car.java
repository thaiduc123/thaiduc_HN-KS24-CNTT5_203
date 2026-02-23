public class Car extends Vehicle{
    public String moving;

    public Car() {
    }

    public Car(String moving) {
        this.moving = moving;
    }

    @Override
    public void move() {
        System.out.println(moving + " - Di chuyển bằng động cơ");
    }

    public String getMoving() {
        return moving;
    }

    public void setMoving(String moving) {
        this.moving = moving;
    }
}