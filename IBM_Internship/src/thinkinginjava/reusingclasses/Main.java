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

        //Exercise 13: (2) Create a class with a method that is overloaded three times.
        // Inherit a new class, add a new overloading of the method, and show that all
        // four methods are available in the derived class.
        System.out.println("-----Exercise 13------");
        ChildrenClass childrenClass = new ChildrenClass();
        childrenClass.doSomething('a');
        childrenClass.doSomething(5);
        childrenClass.doSomething(20.9f);
        childrenClass.doSomething(44.27d);
    }
}