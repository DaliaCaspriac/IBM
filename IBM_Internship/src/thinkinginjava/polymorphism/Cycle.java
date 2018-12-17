package thinkinginjava.polymorphism;

public class Cycle {
    private int nOWheels = -1;

    public static void go(Cycle c) {
        System.out.println(c.getClass() + " go.");
    }

    public int wheels() {
        return nOWheels;
    }
}