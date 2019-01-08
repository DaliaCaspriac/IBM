package thinkinginjava.containersindepth.exercise40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void printArray(Person[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }

    public static void printArrayList(ArrayList<Person> arrayList) {
        for (Person p : arrayList) {
            System.out.println(p.toString());
        }
    }

    public static void main(String[] args) {
        Person[] pers1 = new Person[5];
        pers1[0] = new Person("a", "b");
        pers1[1] = new Person("c", "c");
        pers1[2] = new Person("b", "b");
        pers1[3] = new Person("x", "z");
        pers1[4] = new Person("d", "a");
        System.out.println("-----Comparable array");
        Arrays.sort(pers1);
        printArray(pers1);
        System.out.println("-----Comparable arrayList");
        ArrayList<Person> pers2 = new ArrayList<>();
        pers2.add(pers1[0]);
        pers2.add(pers1[1]);
        pers2.add(pers1[2]);
        pers2.add(pers1[3]);
        pers2.add(pers1[4]);
        Collections.sort(pers2);
        printArrayList(pers2);
        System.out.println("-----Comparator array");
        Arrays.sort(pers1, new PersonComparator());
        printArray(pers1);
        System.out.println("-----Comparator arrayList");
        Collections.sort(pers2, new PersonComparator());
        printArrayList(pers2);
        System.out.println("-----BinarySearch using Comparator");
        int index = Arrays.binarySearch(pers1, new Person("y", "z"), new PersonComparator());
        System.out.println(pers1[index].toString());

    }
}
