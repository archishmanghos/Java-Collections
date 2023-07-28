import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Deque<Integer> dq = new ArrayDeque<>();

        // add
        st.push(2);
        st.push(4);
        st.push(1);
        System.out.println(st);

        dq.offerFirst(2);
        dq.offerFirst(4);
        dq.offerFirst(1);
        System.out.println(dq);

        // remove
        st.pop();
        System.out.println(st);

        dq.pollFirst();
        System.out.println(dq);

        // see top element
        System.out.println("Top element = " + st.peek());
        System.out.println("Top element = " + dq.peekFirst());

        // check emptiness
        System.out.println(st.isEmpty());
        st.pop();
        st.pop();
        System.out.println(st.isEmpty());

        System.out.println(dq.isEmpty());
        dq.pollFirst();
        dq.pollFirst();
        System.out.println(dq.isEmpty());
    }
}
