package thinkinginjava.initializationandcleanup;

public class ThisClass {
    private int f1;
    private int f2;
    private String s1;

    public ThisClass() {
    }

    //Exercise 9: (1) Create a class with two (overloaded) constructors.
    // Using this, call the second constructor inside the first one.
    public ThisClass(int f1, String s1){
        this.f1 = f1;
        this.f2 = 0;
        this.s1 = s1;
    }

    public ThisClass(int f1, int f2, String s1){
        this(f1,s1);
        this.f2 = f2;
    }

    public void first() {
        System.out.println("first method");
        second();
        this.second();
    }

    public void second() {
        System.out.println("second method");
    }
}