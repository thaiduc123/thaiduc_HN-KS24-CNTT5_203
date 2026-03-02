package b3;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker check = new MedicationProcessChecker();
        String[] chk1 = {"PUSH", "PUSH", "POP", "POP"};
        String[] chk2 = {"POP", "PUSH"};
        String[] chk3 = {"PUSH", "PUSH", "POP"};
        check.checkProcess(chk1);
        check.reset();
        check.checkProcess(chk2);
        check.reset();
        check.checkProcess(chk3);
    }
}