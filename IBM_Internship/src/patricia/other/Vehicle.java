package patricia.other;

public class Vehicle {

    private int nOWheels;
    private boolean engine;

    public Vehicle(int nOWheels, boolean engine){
        System.out.println("Vehicle constructor");
        this.nOWheels = nOWheels;
        this.engine = engine;
    }
}
