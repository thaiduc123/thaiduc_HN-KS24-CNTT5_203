public class StudentManager {
    private Student[] students;
    private int count;

    public StudentManager(int capacity) {
        students = new Student[capacity];
        count = 0;
    }

    /* ===== ADD ===== */
    public boolean addStudent(Student s) {
        if (count >= students.length || findById(s.getId()) != null)
            return false;

        students[count++] = s;
        return true;
    }

    /* ===== DISPLAY ===== */
    public void displayAll() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.printf("%-10s %-20s %-5s %-8s %-6s %-10s%n",
                "Mã SV", "Họ tên", "Tuổi", "Giới", "ĐTB", "Xếp loại");

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    /* ===== SEARCH ===== */
    public Student findById(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id))
                return students[i];
        }
        return null;
    }

    public void findByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getName().toLowerCase().contains(keyword.toLowerCase())) {
                students[i].display();
                found = true;
            }
        }
        if (!found)
            System.out.println("Không tìm thấy sinh viên!");
    }

    /* ===== UPDATE ===== */
    public boolean updateStudent(String id, String name, int age,
                                 double math, double physics, double chemistry) {
        Student s = findById(id);
        if (s == null) return false;

        s.setName(name);
        s.setAge(age);
        s.setScores(math, physics, chemistry);
        return true;
    }

    /* ===== DELETE ===== */
    public boolean deleteStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equalsIgnoreCase(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--count] = null;
                return true;
            }
        }
        return false;
    }

    /* ===== SORT ===== */
    public void sortByAverageDesc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getAverage() < students[j + 1].getAverage()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    /* ===== STATISTICS ===== */
    public void statistics() {
        int gioi = 0, kha = 0, tb = 0, yeu = 0;

        for (int i = 0; i < count; i++) {
            switch (students[i].getRank()) {
                case "Giỏi": gioi++; break;
                case "Khá": kha++; break;
                case "Trung bình": tb++; break;
                default: yeu++;
            }
        }

        System.out.println("Giỏi: " + gioi);
        System.out.println("Khá: " + kha);
        System.out.println("Trung bình: " + tb);
        System.out.println("Yếu: " + yeu);
    }
}
