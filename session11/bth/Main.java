package bth;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== ARENA OF HEROES ===");

        List<GameCharacter> characters = new ArrayList<>();

        Warrior Sylas = new Warrior("Sylas", 500, 50, 20);
        Mage Lux = new Mage(" Lux", 350, 40, 200);

        // Anonymous Class tạo Goblin
        GameCharacter goblin = new GameCharacter("Goblin", 100, 10) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("[Quái vật] Goblin cắn trộm " + target.getName() + "...");
                target.takeDamage(10);
            }
        };

        characters.add(Sylas);
        characters.add( Lux);
        characters.add(goblin);

        System.out.println("Đã khởi tạo " + GameCharacter.count + " nhân vật tham gia đấu trường.\n");

        // Giả lập lượt đánh
        Sylas.attack(goblin);
        Lux.useUltimate(Sylas);
        goblin.attack( Lux);

        System.out.println("\n=== THÔNG SỐ SAU LƯỢT ĐẤU ===");
        for (GameCharacter c : characters) {
            c.displayInfo();
        }
    }
}
