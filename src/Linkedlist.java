import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linkedlist {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        // add
        list.add(3);
        list.add(2);
        list.add(9);

        // implementing Iterator
        ListIterator<Integer> li = list.listIterator();
        while (li.hasNext()) System.out.println(li.next());

        // next and previous
        ListIterator<Integer> li1 = list.listIterator();
        System.out.println(li1.hasPrevious());
        if (li1.hasPrevious()) System.out.println(li.previous());
        System.out.println(li1.hasNext());
        System.out.println(li1.next());
        System.out.println(li1.hasPrevious());
        if (li1.hasPrevious()) System.out.println(li.previous());
    }
}
