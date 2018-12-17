package thinkinginjava.polymorphism;

public class Cycle {
    public static void go(Cycle c){
        System.out.println(c.getClass() + " go.");
    }
}
