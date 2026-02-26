public class b4 {
    public static void main(String[] args) {
        EmergencyRoom em = new EmergencyRoom();
        em.patientCheckIn("A");
        em.patientCheckIn("B");
        em.emergencyCheckIn("C");
        em.treatPatient();
        em.treatPatient();
        em.treatPatient();
    }
}