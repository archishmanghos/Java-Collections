package archishman;

import java.util.Iterator;

public class UserList<T> implements Iterable<T> {
    private T[] items;
    private int index, size;

    public UserList() {
        index = size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T x) {
        size++;
        items[index++] = x;
    }

    public T getItemAtIndex(int idx) {
        return items[idx];
    }

    @Override
    public Iterator<T> iterator() {
        return new UserListIterator(this);
    }

    private class UserListIterator implements Iterator<T> {
        private UserList<T> list;
        private int index;

        public UserListIterator(UserList<T> list) {
            this.list = list;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
