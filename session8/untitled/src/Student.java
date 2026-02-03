public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private double math;
    private double physics;
    private double chemistry;
    private double average;
    private String rank;

    public Student(String id, String name, int age, String gender,
                   double math, double physics, double chemistry) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAverage();
        classify();
    }

    /* ===== BUSINESS METHODS ===== */

    public void calculateAverage() {
        this.average = (math + physics + chemistry) / 3;
    }

    public void classify() {
        if (average >= 8.0 && math >= 6.5 && physics >= 6.5 && chemistry >= 6.5) {
            rank = "Giỏi";
        } else if (average >= 6.5 && math >= 5.0 && physics >= 5.0 && chemistry >= 5.0) {
            rank = "Khá";
        } else if (average >= 5.0 && math >= 3.5 && physics >= 3.5 && chemistry >= 3.5) {
            rank = "Trung bình";
        } else {
            rank = "Yếu";
        }
    }

    /* ===== GETTER & SETTER ===== */

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public String getRank() {
        return rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScores(double math, double physics, double chemistry) {
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAverage();
        classify();
    }

    public void display() {
        System.out.printf("%-10s %-20s %-5d %-8s %-6.2f %-10s%n",
                id, name, age, gender, average, rank);
    }
}
