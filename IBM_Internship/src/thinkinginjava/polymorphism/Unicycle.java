package thinkinginjava.polymorphism;

public class Unicycle extends Cycle {
    private int nOWheels = 1;

    public int wheels(){
        return nOWheels;
    }

    public void balance(){
        System.out.println("Balance from Unicycle");
    }
}
