package thinkinginjava.generics.exercise26;

import thinkinginjava.reusingclasses.ParentClass;

public class Main {
    public static void main(String[] args) {
        Number[] numbers = new Integer[5];
        numbers[0] = new Integer(1);
        numbers[1] = new Integer(2);
        numbers[2] = new Integer(3);
        numbers[3] = new Integer(5);
        numbers[4] = new Integer(10);
        for(Number n : numbers){
            System.out.println(n + " " + n.getClass().getSimpleName());
        }
    }
}
