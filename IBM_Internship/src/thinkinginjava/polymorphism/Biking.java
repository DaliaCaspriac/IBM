package thinkinginjava.polymorphism;

import static thinkinginjava.polymorphism.Cycle.go;

public class Biking {
    public static void main(String[] args) {
        //Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
        //Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
    }

    public static void ride(Cycle cycle){
        System.out.println("ride...");
        go(cycle);
        //System.out.println(cycle.wheels());
    }


}
