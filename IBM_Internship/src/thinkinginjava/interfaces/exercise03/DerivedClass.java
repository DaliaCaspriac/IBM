package thinkinginjava.interfaces.exercise03;

public class DerivedClass extends BaseClass {
    private int var = 10;

    @Override
    public void print() {
        System.out.println("Var = " + var);
    }
}
