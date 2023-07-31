import archishman.StudentMarks;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        // add elements
        pq1.offer(2);
        pq1.offer(1);
        pq1.offer(100);
        pq1.offer(0);
        System.out.println(pq1);

        // remove bottom 2 elements
        List<Integer> li1 = new ArrayList<>();
        while (!pq1.isEmpty() && li1.size() < 2) {
            li1.add(pq1.poll());
        }
        System.out.println(li1);
        System.out.println(pq1);

        // Create a new class of StudentMarks, add 5 objects to a list and then duplicate the list to a Priority Queue
        List<StudentMarks> li2 = new ArrayList<>();
        li2.add(new StudentMarks(70, 80));
        li2.add(new StudentMarks(38, 10));
        li2.add(new StudentMarks(100, 38));
        li2.add(new StudentMarks(40, 88));
        li2.add(new StudentMarks(97, 19));

        PriorityQueue<StudentMarks> pq2 = new PriorityQueue<>(li2);
        // System.out.println(pq2); -> runs into exception as neither comparable or comparator is defined

        // Set priority using Comparable
        PriorityQueue<StudentMarks> pq3 = new PriorityQueue<>(li2);
        List<StudentMarks> li3 = new ArrayList<>();
        while (!pq3.isEmpty()) {
            li3.add(pq3.poll());
        }
        System.out.println(li3);

        // Set priority using Comparator
        PriorityQueue<StudentMarks> pq4 = new PriorityQueue<>((a, b) -> b.getPhysics() - a.getPhysics());
        pq4.addAll(li2);
        List<StudentMarks> li4 = new ArrayList<>();
        while (!pq4.isEmpty()) {
            li4.add(pq4.poll());
        }
        System.out.println(li4);
    }
}
