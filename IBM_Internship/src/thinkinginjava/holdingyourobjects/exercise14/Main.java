package thinkinginjava.holdingyourobjects.exercise14;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void insert(LinkedList<Integer> list, Integer[] elements) {
        for (int i = 0; i < elements.length; i++) {
            ListIterator<Integer> it = list.listIterator(list.size() / 2);
            it.add(elements[i]);
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        Integer[] elements = {10, 20, 30, 40, 50};
        insert(new LinkedList<Integer>(),elements);
    }
}
