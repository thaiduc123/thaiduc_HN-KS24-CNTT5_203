public class b4 {
    public static void main(String[] args) {
        ClassRoom n1 = new ClassRoom("THD");
        ClassRoom n2 = new ClassRoom("DUC");
        ClassRoom n3 = new ClassRoom("TTTTTTT");
        n1.contribute(100000);
        n2.contribute(50000);
        n3.contribute(150000);
        ClassRoom.showClassFund();
    }
}
