package b4;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue eq = new EmergencyQueue();
        eq.addPatient("E01", "Nguyễn Văn A", 2);
        eq.addPatient("E02", "Trần Thị B", 1);
        eq.addPatient("E03", "Lê Văn C", 2);
        eq.addPatient("E04", "Phạm Văn D", 1);
        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();
    }
}
