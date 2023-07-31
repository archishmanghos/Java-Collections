package Sets;

import archishman.StudentMarks;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeAndNavigableSets {
    public static void main(String[] args) {
        Set<StudentMarks> treeset = new TreeSet<>((a, b) -> (b.getPhysics() - a.getPhysics()));
        treeset.add(new StudentMarks(70, 80));
        treeset.add(new StudentMarks(38, 10));
        treeset.add(new StudentMarks(100, 38));
        treeset.add(new StudentMarks(40, 88));
        treeset.add(new StudentMarks(97, 19));
        System.out.println("[ ");
        for (StudentMarks it : treeset) System.out.println(it);
        System.out.println("]");

        NavigableSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(32);
        set.add(1);
        set.add(7);
        System.out.print("[ ");
        for (int it : set) System.out.print(it + ", ");
        System.out.print("]");
        System.out.println();

        System.out.println(set.floor(5));
        System.out.println(set.floor(6));
        System.out.println(set.ceiling(5));
        System.out.println(set.ceiling(6));
        System.out.println(set.lower(5));
        System.out.println(set.lower(6));
        System.out.println(set.higher(5));
        System.out.println(set.higher(6));
        System.out.println(set.lower(1));
        System.out.println(set.higher(100));
    }
}
