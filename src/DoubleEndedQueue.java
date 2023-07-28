import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // add
        dq.offerFirst(2);
        dq.offerFirst(4);
        dq.offerFirst(1);
        dq.offerLast(2);
        dq.offerLast(4);
        dq.offerLast(1);
        System.out.println(dq);

        // remove
        dq.pollFirst();
        System.out.println(dq);

        // see top and last element
        System.out.println("Top element = " + dq.peekFirst());
        System.out.println("Last element = " + dq.peekLast());

        // check emptiness
        System.out.println(dq.isEmpty());
        dq.pollFirst();
        dq.pollFirst();
        dq.pollLast();
        dq.pollLast();
        dq.pollFirst();
        System.out.println(dq.isEmpty());
    }
}
