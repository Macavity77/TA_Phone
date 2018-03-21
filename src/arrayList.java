import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class arrayList<E> {
    private E[] array;
    private int size;
    private static int RFactor = 2;
    private static int initial = 10;

    public arrayList() {
        array = (E[]) new Object[initial];
        size = 0;
    }

    public arrayList(int ini) {
        array = (E[]) new Object[ini];
        size = 0;
    }

    public void add(E item) {
        if (size == array.length) {
            resize();
        }
        array[size] = item;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public E getlast() {
        return get(size - 1);
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E item = array[index];
        array[index] = null;
        while (index < size) {
            array[index] = array[index + 1];
            array[index + 1] = null;
            index++;
        }
        return item;
    }

    public E removelast() {
        return remove(size - 1);
    }

    public int size() {
        return size;
    }

    public void set(int index, E item) {
        get(index);
        array[index] = item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void resize() {
        E[] a = (E[]) new Object[size * RFactor];
        System.arraycopy(array, 0, a, 0, size);
        array = a;
    }
}
