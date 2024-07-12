package module9.MyArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private T[] array;
    private int size;

    public MyArrayList() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T value) {
        ensureCapacity();
        array[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неправильний індекс");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;
    }

    public void clear() {
        Arrays.fill(array, 0, size, null);
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неправильний індекс");
        }
        return array[index];
    }



    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }
}
