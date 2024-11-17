import java.util.*;

public class MyCollectionClass {
    public static void main(String[] args) {
        {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(1);
            list.add(50);
            list.add(5);
            System.out.println(Collections.min(list));// 1
            System.out.println(Collections.max(list));// 50
            System.out.println(Collections.frequency(list, 50));// 1

            Collections.sort(list);
            System.out.println(list);// [1, 2, 5, 50]

            // Descending order
            Collections.sort(list, Comparator.reverseOrder());
            System.out.println(list);// [50, 5, 2, 1]
        }
    }

}
