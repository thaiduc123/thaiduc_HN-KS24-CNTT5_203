public class Manager extends Employee implements Bonus{
    private double bonus;

    public Manager() {
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return bonus + getBonus();
    }

    @Override
    public double getBonus() {
        return bonus;
    }
}