package thinkinginjava.reusingclasses;

public class Root {
    private Component1 component1;
    private Component2 component2;
    private Component3 component3;

    public Root() {
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
        System.out.println("Created an instance of Root");
    }

    public void dispose() {
        component1.dispose(); // call dispose() method for Component1 object
        component2.dispose(); // call dispose() method for Component2 object
        component3.dispose(); // call dispose(0 method for Component3 object
        System.out.println("Root dispose");
    }
}
