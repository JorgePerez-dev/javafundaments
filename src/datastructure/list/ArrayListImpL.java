package datastructure.list;

public class ArrayListImpL<E> implements List<E> {

    private Object[] data = new Object[10];
    private int size = 0;

    @Override
    public void add(E e) {
        data[size] = e;
        size++;
    }

    @Override
    public E removeLast() {
        if (size == 0) return null;

        E elem = (E) data[size - 1];
        size--;
        return elem;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}