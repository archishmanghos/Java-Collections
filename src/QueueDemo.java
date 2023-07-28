import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        // add
        q.offer(2);
        q.offer(4);
        q.offer(1);
        System.out.println(q);

        dq.offerLast(2);
        dq.offerLast(4);
        dq.offerLast(1);
        System.out.println(dq);

        // remove
        q.poll();
        System.out.println(q);

        dq.pollFirst();
        System.out.println(dq);

        // see top element
        System.out.println("Top element = " + q.peek());
        System.out.println("Top element = " + dq.peekFirst());

        // check emptiness
        System.out.println(q.isEmpty());
        q.poll();
        q.poll();
        System.out.println(q.isEmpty());

        System.out.println(dq.isEmpty());
        dq.pollFirst();
        dq.pollFirst();
        System.out.println(dq.isEmpty());
    }
}
