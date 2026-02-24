//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee(1, "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice(2, "Nước cam", 40000, 10);
        drinks[2] = null;
        for (Drink d : drinks){
            if (d != null){
                d.displayInfo();
                if(d instanceof IMixable){
                    ((IMixable)d).mix();
                };
                System.out.println("Thành tiền: "+ d.calculatePrice());
            }
        }
    }
}