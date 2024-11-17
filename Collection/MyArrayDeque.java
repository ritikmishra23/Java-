
//ArrayDeque=> We can add, delete and peek element from both end in this.
import java.util.ArrayDeque;

public class MyArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> num = new ArrayDeque<>();

        // adding operation num.offer=num.offerLast
        num.offer(23);
        num.offerFirst(1);
        num.offerLast(18);
        num.offer(2);
        num.offerFirst(7);
        System.out.println(num);// [7, 1, 23, 18, 2]

        // peek operation
        System.out.println(num.peek()); // 7
        System.out.println(num.peekFirst());// 7
        System.out.println(num.peekLast());// 7

        // deletion operation
        System.out.println(num.poll());// 7
        System.out.println(num);// [1, 23, 18, 2]

        System.out.println(num.pollFirst());// 1
        System.out.println(num);// [23, 18, 2]

        System.out.println(num.pollLast());// 2
        System.out.println(num);// [23, 18]

    }

}
