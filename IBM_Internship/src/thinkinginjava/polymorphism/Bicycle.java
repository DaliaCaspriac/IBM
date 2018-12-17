package thinkinginjava.polymorphism;

public class Bicycle extends Cycle {
    private int nOWheels = 2;

    public int wheels(){
        return nOWheels;
    }

    public void balance(){
        System.out.println("Balance from Bicyle");
    }
}