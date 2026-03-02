package b1;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();
        history.addEdit(new EditAction("Thêm triệu chứng sốt", "09:00"));
        history.addEdit(new EditAction("Cập nhật chẩn đoán viêm họng", "09:15"));
        history.addEdit(new EditAction("Thêm thuốc Paracetamol", "09:30"));
        history.displayHistory();
        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());
        System.out.println("\nThực hiện Undo:");
        history.undoEdit();
        history.displayHistory();
    }
}
