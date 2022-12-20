import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;


public class ArrayIterator<T> implements Iterator<T> {
    int pos = 0;
    T[] arr;

    @Override
    public boolean hasNext() {
        return (pos < arr.length);
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();

        return arr[pos++];
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    public ArrayIterator(T[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 4, 2, 3, 7, 6, 8, 9};
        String[] arr1 = {"s", "b", "g", "h", "j"};
        Iterator<Integer> it = new ArrayIterator<>(arr);
        Iterator<String> it1 = new ArrayIterator<>(arr1);

        while (it.hasNext()) {
            int el = it.next();
            System.out.println(el);
        }
        while (it1.hasNext()) {
            String el = it1.next();
            System.out.print(el);
        }
    }
}
