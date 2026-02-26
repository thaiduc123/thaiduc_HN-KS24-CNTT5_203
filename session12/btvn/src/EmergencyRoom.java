import java.util.LinkedList;

public class EmergencyRoom {
    private LinkedList<String> list = new LinkedList<>();
    public void patientCheckIn(String name) {
        list.addLast(name);
    }
    public void emergencyCheckIn(String name) {
        list.addFirst("CẤP CỨU: " + name);
    }
    public void treatPatient() {
        if (list.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
            return;
        }
        String patient = list.removeFirst();
        if (patient.startsWith("CẤP CỨU: ")) {
            System.out.println("Đang cấp cứu: " + patient);
        } else {
            System.out.println("Đang khám: " + patient);
        }
    }
}