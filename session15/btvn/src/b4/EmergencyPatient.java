package b4;

public class EmergencyPatient {
     String id;
     String name;
     int priority;
     int arrivalOrder;
    public EmergencyPatient(String id, String name, int priority, int arrivalOrder) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.arrivalOrder = arrivalOrder;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPriority() {
        return priority;
    }
    public int getArrivalOrder() {
        return arrivalOrder;
    }
    @Override
    public String toString() {
        return "ID: " + id + ". Tên: " + name + ". Mức độ: " + (priority == 1 ? "CẤP CỨU" : "THƯỜNG");
    }
}
