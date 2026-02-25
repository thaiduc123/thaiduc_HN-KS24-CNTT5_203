package bth;

public class Warrior extends GameCharacter implements ISkill {

    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Chiến binh] " + name + " tấn công " + target.getName() + "!");
        target.takeDamage(attackPower);
    }

    // Giảm sát thương theo giáp
    @Override
    public void takeDamage(int amount) {
        int reducedDamage = amount - armor;
        if (reducedDamage < 0) reducedDamage = 0;

        System.out.println(name + " giảm " + armor + " sát thương nhờ giáp.");
        super.takeDamage(reducedDamage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println(name + " dùng chiêu 'Chiếm Đoạt Uy Lực'!");
        int damage = attackPower * 2;

        target.takeDamage(damage);

        // Tự mất 10% HP hiện tại
        int selfDamage = (int)(hp * 0.1);
        this.takeDamage(selfDamage);

        System.out.println(name + " tự mất " + selfDamage + " HP do gắng sức.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Giáp: " + armor);
    }
}
