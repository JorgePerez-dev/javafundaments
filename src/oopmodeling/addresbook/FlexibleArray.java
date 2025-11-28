package oopmodeling.addresbook;

import java.util.ArrayList;

public class FlexibleArray<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public boolean remove(T element) {
        return list.remove(element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
