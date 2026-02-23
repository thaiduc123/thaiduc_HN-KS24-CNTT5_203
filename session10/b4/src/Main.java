public class Main {
    public static void main(String[] args) {
        RemoteControl light = new RemoteControl() {
            @Override
            public void PowerOn() {
                System.out.println("Đèn đã bật");
            }
        };
        light.PowerOn();
        light.checkBatery();
    }
}