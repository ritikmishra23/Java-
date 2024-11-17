import java.util.*;

public class MyArraysClass {
    public static void main(String[] args) {
        int num[] = { 5, 1, 90, 45, 78 };

        // sorting
        // Arrays.sort(num);// quick sort
        System.out.println(num);// it will print the reference (memory address) of the num array, something like
                                // [I@<hashcode>.
        System.out.println(Arrays.toString(num));
        // To correctly print the array in array format (e.g., [1, 5, 45, 78, 90]), you
        // need to use Arrays.toString(num).
        // for (int i : num)
        // System.out.println(i);

        // Binary search
        int index = Arrays.binarySearch(num, 90);
        System.out.println("index of element 90 is" + index);// 2

        Arrays.fill((num), 20);
        System.out.println(Arrays.toString(num));// [20, 20, 20, 20, 20]

    }
}
