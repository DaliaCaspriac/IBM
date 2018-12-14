package thinkinginjava.reusingclasses;

public class Stem extends Root {
    private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    public Stem() {
        super();
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
        System.out.println("Created an instance of Stem");
    }

    public void dispose() {
        super.dispose(); // call Root's dispose() method
        component1.dispose();
        component2.dispose();
        component3.dispose();
        System.out.println("Stem dispose");
    }
}