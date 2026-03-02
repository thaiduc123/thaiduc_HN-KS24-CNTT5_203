package b2;

public class Main {
    public static void main(String[] args) {
        PatientQueue queue = new PatientQueue();
        queue.addPatient(new Patient("01", "THD", 25));
        queue.addPatient(new Patient("02", "DTH", 30));
        queue.addPatient(new Patient("03", "TDH", 40));
        queue.displayQueue();
        System.out.println("\nBệnh nhân tiếp theo:");
        System.out.println(queue.peekNextPatient());
        System.out.println("\nGọi khám:");
        queue.callNextPatient();
        queue.displayQueue();
    }
}