import archishman.UserList;

import java.util.Iterator;

public class CollectionsTest {
    public static void main(String[] args) {
        UserList<Integer> list = new UserList<>();
        list.add(7);
        list.add(2);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
        for (int x : list) System.out.println(x);
        System.out.println(list.getItemAtIndex(1));
    }
}
