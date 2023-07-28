import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        // add
        list1.add(2);
        list1.add(5);
        list1.add(7);

        // set
        list1.set(1, 4);

        // print
        System.out.println(list1);

        // copy list to another
        List<Integer> list2 = new ArrayList<>(list1);
        System.out.println(list2);

        // add all
        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(8);
        list3.add(4);
        list3.addAll(list1);
        System.out.println(list3);

        // index of
        System.out.println(list3.indexOf(4));

        // last Index of
        System.out.println(list3.lastIndexOf(4));

        // sub list
        System.out.println(list3.subList(2, 5));

        // ArrayList to Array
        Integer[] arr = list3.toArray(new Integer[0]);
        for (int i : arr) System.out.print(i + ", ");
        System.out.println();
    }
}
