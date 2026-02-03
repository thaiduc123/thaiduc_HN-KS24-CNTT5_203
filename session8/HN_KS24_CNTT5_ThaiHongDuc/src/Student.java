public class Student {
    String id;
    String name;
    double score = 0;
    public Student(){

    };
    public Student(String id, String name, double score){
        this.id=id;
        this.name=name;
        this.score = score;
    };
    public String getId(){
        return id;
    };
    public void setId(String id){
        if (id.matches("^SV\\d{3}$")){
            this.id=id;
        } else {
            System.out.println("không hợp lệ");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("không hợp lệ");
        }
    }
    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else {
            return "Trung Binh";
        }
    }
}


























//class Student {
//    private String id;
//    private String name;
//    private double score;
//
//    // Constructor không tham số
//    public Student() {
//    }
//
//    // Constructor đầy đủ tham số
//    public Student(String id, String name, double score) {
//        this.id = id;
//        this.name = name;
//        this.score = score;
//    }
//
//    // Getters & Setters
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        if (id.matches("^SV\\d{3}$")) {
//            this.id = id;
//        } else {
//            System.out.println("Mã sinh viên không hợp lệ! (Ví dụ: SV001)");
//        }
//    }
//
