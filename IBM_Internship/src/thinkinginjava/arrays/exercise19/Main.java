package thinkinginjava.arrays.exercise19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] p1 = new Person[3];
        Person[] p2 = new Person[3];
        p1[0] = new Person(10);
        p1[1] = new Person(11);
        p1[2] = new Person(12);
        p2[0] = new Person(10);
        p2[1] = new Person(11);
        p2[2] = new Person(12);
        System.out.println(Arrays.equals(p1, p2));
    }
}
