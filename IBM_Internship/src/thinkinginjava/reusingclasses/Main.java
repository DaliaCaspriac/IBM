package thinkinginjava.reusingclasses;

public class Main {

    public static void main(String[] args) {
        //Exercise 9:   (2) Create a class called Root that contains an instance of each
        // of the classes (that you also create) named Component1, Component2, and Component3.
        // Derive a class Stem from Root that also contains an instance of each “component.”
        // All classes should have default constructors that print a message about that class.
        Root root = new Root();
        System.out.println("---------------------");
        Stem stem = new Stem();

        //Exercise 12:   (3) Add a proper hierarchy of dispose( ) methods to all the classes
        // in Exercise 9.
        try {
            System.out.println("----Exercise 12----");
        } finally {
            stem.dispose();
        }
    }
}