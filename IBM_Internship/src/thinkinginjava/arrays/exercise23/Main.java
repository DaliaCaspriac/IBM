package thinkinginjava.arrays.exercise23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = new Integer[5];
        ints[0] = 5;
        ints[1] = 2;
        ints[2] = 4;
        ints[3] = 3;
        ints[4] = 1;
        Arrays.sort(ints,new IntegerComparator());
        for(int i = 0 ; i < ints.length; i++){
            System.out.println(ints[i]);
        }
    }
}
