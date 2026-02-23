public abstract class Animal {
    protected String name;

    public Animal() {
    }

    public Animal(String action) {
        this.name = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}