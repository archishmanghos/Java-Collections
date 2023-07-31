package Sets;

import archishman.StudentMarks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        List<Integer> li1 = new ArrayList<>();
        li1.add(3);
        li1.add(8);
        li1.add(4);
        li1.add(2);
        li1.add(5);
        li1.add(7);

        // initialise using a list
        Set<Integer> set1 = new HashSet<>(li1);
        System.out.print("[ ");
        for (int it : set1) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();

        // add elements
        set1.add(9);
        set1.add(5);
        System.out.print("[ ");
        for (int it : set1) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();

        // remove
        set1.remove(2);
        set1.remove(8);
        set1.remove(5);
        System.out.print("[ ");
        for (int it : set1) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();

        // empty set
        set1.clear();
        System.out.print("[ ");
        for (int it : set1) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();

        // intersection of 2 sets
        set1.addAll(li1);
        Set<Integer> set2 = new HashSet<>();
        set2.add(8);
        set2.add(4);
        set2.add(5);
        set2.add(10);
        set2.add(15);

        System.out.print("[ ");
        for (int it : set1) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();
        System.out.print("[ ");
        for (int it : set2) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();

        set1.retainAll(set2);
        System.out.print("[ ");
        for (int it : set1) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();
        System.out.print("[ ");
        for (int it : set2) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();
        System.out.println();

        // difference of 2 sets
        Set<Integer> set3 = new HashSet<>(li1);
        System.out.print("[ ");
        for (int it : set3) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();
        System.out.print("[ ");
        for (int it : set2) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();

        set3.removeAll(set2);
        System.out.print("[ ");
        for (int it : set3) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();
        System.out.print("[ ");
        for (int it : set2) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();
        System.out.println();

        // union of 2 sets
        Set<Integer> set4 = new HashSet<>(li1);
        System.out.print("[ ");
        for (int it : set4) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();
        System.out.print("[ ");
        for (int it : set2) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();

        set4.addAll(set2);
        System.out.print("[ ");
        for (int it : set4) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();
        System.out.print("[ ");
        for (int it : set2) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();
        System.out.println();

        // contains
        Set<Integer> set5 = new HashSet<>(li1);
        System.out.print("[ ");
        for (int it : set5) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();

        System.out.println(set5.contains(2));
        System.out.println(set5.contains(9));
        System.out.println();


        // Adding hashcode and equals in user-defined classes
        Set<StudentMarks> set6 = new HashSet<>();
        set6.add(new StudentMarks(70, 80));
        set6.add(new StudentMarks(38, 10));
        set6.add(new StudentMarks(100, 38));
        set6.add(new StudentMarks(40, 88));
        set6.add(new StudentMarks(97, 19));
        System.out.println("[ ");
        for (StudentMarks it : set6) System.out.println(it);
        System.out.println("]");

        System.out.println(set6.contains(new StudentMarks(70, 80)));
    }
}
