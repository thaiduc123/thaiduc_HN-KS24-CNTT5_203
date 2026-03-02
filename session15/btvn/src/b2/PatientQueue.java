package b2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue = new LinkedList<>();
    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Đã thêm bệnh nhân: " + p);
    }
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân nào.");
            return null;
        }
        Patient p = queue.poll();
        System.out.println("Đang khám: " + p);
        return p;
    }
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi đang rỗng.");
            return null;
        }
        return queue.peek();
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public void displayQueue() {
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}