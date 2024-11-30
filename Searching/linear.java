package Searching;

// A linear search is the simplest approach employed to search for an element in a data set. 
// It examines each element until it finds a match, starting at the beginning of the data set, until the end. 
// The search is finished and terminated once the target element is located
public class linear {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String a[]) {
        int[] a = { 10, 20, 30, 50, 70, 90 };
        int key = 50;
        System.out.println(key + " is found at index: " + linearSearch(a, key));
    }

}
