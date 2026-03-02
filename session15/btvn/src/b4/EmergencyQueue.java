package b4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmergencyQueue {
    PriorityQueue<EmergencyPatient> q;
    int count = 0;
    public EmergencyQueue() {
        q = new PriorityQueue<>(new Comparator<EmergencyPatient>() {
            @Override
            public int compare(EmergencyPatient p1, EmergencyPatient p2) {
                if (p1.getPriority() != p2.getPriority()) {
                    return p1.getPriority() - p2.getPriority();
                }
                return p1.getArrivalOrder() - p2.getArrivalOrder();
            }
        });
    }
    public void addPatient(String id, String name, int priority) {
        EmergencyPatient p = new EmergencyPatient(id, name, priority, count++);
        q.offer(p);
        System.out.println("Đã thêm: " + p);
    }
    public EmergencyPatient callNextPatient() {
        if (q.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
            return null;
        }
        EmergencyPatient next = q.poll();
        System.out.println("Đang khám: " + next);
        return next;
    }
    public void displayQueue() {
        if (q.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        System.out.println("DANH SÁCH");
        for (EmergencyPatient p : q) {
            System.out.println(p);
        }
    }
}
