
//HashSet=> it store unique and unordered value.
import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(23);
        set.add(1);
        set.add(18);
        set.add(18);
        set.add(24);
        set.add(0);
        System.out.println(set);// [0, 1, 18, 23, 24]

        System.out.println(set.remove(18));// true
        System.out.println(set);// [0, 1, 23, 24]

        System.out.println(set.contains(23));// true
        System.out.println(set.isEmpty());// false
        System.out.println(set.size());// 4
        // set.clear();
        System.out.println(set);// []

        // Adding two set
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(23);
        set2.add(100);
        set2.add(2);
        set.addAll(set2);
        System.out.println(set);// [0, 1, 2, 100, 23, 24]
    }

}
