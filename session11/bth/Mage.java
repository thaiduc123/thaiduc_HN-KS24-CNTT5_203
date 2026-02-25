package bth;

public class Mage extends GameCharacter implements ISkill {

    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {

        if (mana >= 5) {
            System.out.println("[Pháp sư] " + name + " tung phép!");
            mana -= 5;
            target.takeDamage(attackPower);
        } else {
            System.out.println(name + " hết mana, đánh thường!");
            target.takeDamage(attackPower / 2);
        }
    }

    @Override
    public void useUltimate(GameCharacter target) {

        if (mana >= 50) {
            System.out.println(name + " dùng chiêu 'Cầu Vồng Tối Thượng'!");
            mana -= 50;
            target.takeDamage(attackPower * 3);
            System.out.println(name + " tốn 50 mana.");
        } else {
            System.out.println(name + " không đủ mana để dùng chiêu cuối!");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}
