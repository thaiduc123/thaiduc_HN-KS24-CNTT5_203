public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        circle.setRadius(20);
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("------- KẾT QUẢ --------");
        System.out.println("Chu vi hình tam giác là: " + rectangle.getPerimeter());
        System.out.println("Diện tích hình tam giác là: " + rectangle.getArena());
        System.out.println("------------------------");
        System.out.println("Chu vi hình tròn là: " + circle.getPerimeter());
        System.out.println("Diện tích hình tròn là: " + circle.getArena());
        System.out.println("------------------------");
    }
}