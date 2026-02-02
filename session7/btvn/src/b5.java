public class b5 {
    public static void main(String[] args) {
        double score = 8.5;
//         Config.MAX_SCORE = 20.0;
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("hợp lệ: " + score);
        } else {
            System.out.println("không hợp lệ");
        }
    }
}
