
//Priority Queue=> In this element at top is decided according to priority.
// Queue<Integer> num = new PriorityQueue<>();=> it implement Min-Heap.
// Queue<Integer> numb = new PriorityQueue<>(Comparator.reverseOrder());=>it implement Max-Heap by adding comparator.
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> num = new PriorityQueue<>();
        // adding element
        num.offer(12);
        num.offer(2);
        num.offer(6);
        num.offer(28);
        System.out.println(num);// [2, 12, 6, 28] Min heap
        // deleting
        System.out.println(num.poll());// 2
        System.out.println(num); // [6, 12, 28]

        System.out.println(num.peek());// 6

        // MAX HEAP
        Queue<Integer> numb = new PriorityQueue<>(Comparator.reverseOrder());
        // adding element
        numb.offer(12);
        numb.offer(2);
        numb.offer(6);
        numb.offer(28);
        System.out.println("max heap priority queue");
        System.out.println(numb);// [28, 12, 6, 2]Max heap
        // deleting
        System.out.println(numb.poll());// 28
        System.out.println(numb); // [12, 2, 6]

        System.out.println(numb.peek());// 12
    }
}
