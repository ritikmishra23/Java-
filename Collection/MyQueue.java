import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        // implementing Queue interface using Linkedlist class
        Queue<Integer> num = new LinkedList<>();
        // Adding value in queue
        num.offer(23);
        num.offer(28);
        num.offer(2);
        System.out.print(num);// [23, 28, 2]

        // delete value
        System.out.println(num.poll());// 23
        System.out.println(num);// [28, 2]

        // knowing next element in queue or head
        System.out.println(num.peek());// 28

    }
}
