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

        //Exercise 16: (2) Create a class called Amphibian. From this, inherit a class called Frog.
        // Put appropriate methods in the base class. In main( ), create a Frog and
        // upcast it to Amphibian and demonstrate that all the methods still work.
        System.out.println("----Exercise16----");
        Amphibian frog = new Frog();
        frog.say();
        frog.eat();
        frog.drink();

        //Exercise 17:  (1) Modify Exercise 16 so that Frog overrides the method definitions
        // from the base class (provides new definitions using the same method signatures).
        // Note what happens in main( ).
        System.out.println("----Exercise17-----");
        Amphibian frog2 = new Frog();
        frog2.say();
        frog2.eat();
        frog2.drink();
    }
}