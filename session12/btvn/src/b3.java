import java.util.ArrayList;
import java.util.List;

public class b3 {
    public static <T> List<T> findCommonPatients(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            T n = list1.get(i);
            if (list2.contains(n) && !result.contains(n)) {
                result.add(n);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(101);
        a.add(102);
        a.add(105);
        List<Integer> b = new ArrayList<>();
        b.add(102);
        b.add(105);
        b.add(108);
        List<Integer> commonInt = findCommonPatients(a, b);
        System.out.println("TH 1: " + commonInt);
        List<String> bhA = new ArrayList<>();
        bhA.add("DN01");
        bhA.add("DN02");
        bhA.add("DN03");
        List<String> bhB = new ArrayList<>();
        bhB.add("DN02");
        bhB.add("DN04");
        List<String> str = findCommonPatients(bhA, bhB);
        System.out.println("TH 2: " + str);
    }
}
